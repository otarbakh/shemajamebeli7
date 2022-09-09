package com.example.shemajamebeli7.di.repository

import com.example.shemajamebeli7.Resource
import com.example.shemajamebeli7.di.api.CurrentCoursesVertical
import kotlinx.coroutines.flow.flow

class CurrentCoursesRepositoryImpl(
    private val currentCoursesVertical: CurrentCoursesVertical
):Repository {


    override suspend fun retrieveLists() {
        getLists()
    }

    private fun getLists() = flow {
        val response = currentCoursesVertical.getCurrentCourses()

        try {
            if (response.isSuccessful) {
                val body = response.body()
                Resource.Success(body).let {
                    emit(Resource.Success(body!!))
                }
            } else {
                val error = response.errorBody()
                emit(Resource.Error(error.toString()))
            }

        }catch (e:Throwable){
            emit(Resource.Error(e.message.toString()))
        }

    }
}