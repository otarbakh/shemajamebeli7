package com.example.shemajamebeli7.models

import com.google.gson.annotations.SerializedName

data class CurrentCourses(
    val id:String,
    @SerializedName("booking_time")
    val bookingTime:String,
    val progress:String,
    val title:String,
    val mainColor:String,
    @SerializedName("background_color_percent")
    val backgroundColorPercent:String,
    @SerializedName("play_button_color_percent")
    val playButtonCollorPercent:String,
    val image:String
)