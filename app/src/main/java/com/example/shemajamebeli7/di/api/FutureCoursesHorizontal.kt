package com.example.shemajamebeli7.di.api

import com.example.shemajamebeli7.models.NewCourses
import retrofit2.Response
import retrofit2.http.GET

interface FutureCoursesHorizontal {
    @GET("4167a598-b68c-420f-b6e1-fef68b89a10d")
    suspend fun getNewCourses(
    ): Response<NewCourses>
}