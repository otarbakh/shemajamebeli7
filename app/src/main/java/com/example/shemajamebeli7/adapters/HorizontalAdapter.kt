package com.example.shemajamebeli7.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shemajamebeli7.databinding.SingleHorizontalBinding

class HorizontalAdapter: ListAdapter<Teams.MRdata.ConstructorsTable.Constructor, ConstructorsAdapter.ConstructorsViewHolder>(TeamsDiffCallBack()) {

//    private lateinit var itemClickListener: (PopularResponse.Result1, Int) -> Unit

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ConstructorsViewHolder {
        val binding =
            SingleHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConstructorsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConstructorsViewHolder, position: Int) {
        holder.bindData()
    }


    inner class ConstructorsViewHolder(private val binding: SingleHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private var model: Teams.MRdata.ConstructorsTable.Constructor? = null
        fun bindData() {
            model = getItem(bindingAdapterPosition)
            binding.apply {
                tvTeamName.text = model?.name
                tvTeamNationality.text = model?.nationality


            }
        }

//    fun setOnItemClickListener(clickListener: (PopularResponse.Result1, Int) -> Unit) {
//        itemClickListener = clickListener
//    }
    }
}
class TeamsDiffCallBack : DiffUtil.ItemCallback<Teams.MRdata.ConstructorsTable.Constructor>() {
    override fun areItemsTheSame(oldItem: Teams.MRdata.ConstructorsTable.Constructor, newItem: Teams.MRdata.ConstructorsTable.Constructor): Boolean {
        return oldItem.constructorId == newItem.constructorId
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(
        oldItem: Teams.MRdata.ConstructorsTable.Constructor, newItem: Teams.MRdata.ConstructorsTable.Constructor
    ): Boolean {
        return oldItem == newItem
    }
}