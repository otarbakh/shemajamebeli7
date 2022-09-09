package com.example.shemajamebeli7.adapters

class VerticalAdapter: ListAdapter<Teams.MRdata.ConstructorsTable.Constructor, ConstructorsAdapter.ConstructorsViewHolder>(TeamsDiffCallBack()) {


    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ConstructorsViewHolder {
        val binding =
            SingleMovieLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConstructorsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConstructorsViewHolder, position: Int) {
        holder.bindData()
    }


    inner class ConstructorsViewHolder(private val binding: SingleMovieLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private var model: Teams.MRdata.ConstructorsTable.Constructor? = null
        fun bindData() {
            model = getItem(bindingAdapterPosition)
            binding.apply {
                tvTeamName.text = model?.name
                tvTeamNationality.text = model?.nationality

            }
        }
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