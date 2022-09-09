package com.example.shemajamebeli7.models

import com.google.gson.annotations.SerializedName

data class NewCourses (

    val id: String,
    @SerializedName("icon_type")
    val iconType:String,
    val duration:String,
    val title:String,
    val question:String,
    val mainColor:String

)