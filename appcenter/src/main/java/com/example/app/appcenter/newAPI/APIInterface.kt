package com.example.app.appcenter.newAPI

import com.example.app.appcenter.model.MoreAppMainModel
import retrofit2.http.GET
import retrofit2.http.Path

interface APIInterface {

    @GET("{packageName}")
    suspend fun getMoreAppResponse(@Path("packageName") packageName: String): MoreAppMainModel
}