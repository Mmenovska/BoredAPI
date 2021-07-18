package com.magdalena.android.boredapi.api

import com.magdalena.android.boredapi.models.ActivityResponse
import retrofit2.Call
import retrofit2.http.GET

interface BoredAPI {

    @GET ("/api/activity/")
    fun getRandomActivity () : Call<ActivityResponse>
}