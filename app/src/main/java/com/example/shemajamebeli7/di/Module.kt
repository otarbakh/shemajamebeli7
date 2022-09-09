package com.example.shemajamebeli7.di

import com.example.shemajamebeli7.di.api.CurrentCoursesVertical
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Module {

    @Provides
    @Singleton
    fun provideCurrentCourses(): CurrentCoursesVertical {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io/v3")
            .build()
            .create(CurrentCoursesVertical::class.java)
    }
}