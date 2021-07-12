package com.gsixacademy.android.boredapi.api

import com.gsixacademy.android.boredapi.models.ActivityResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BoredAPI {

    @GET ("/api/activity/")
    fun getRandomActivity () : Call<ActivityResponse>
}