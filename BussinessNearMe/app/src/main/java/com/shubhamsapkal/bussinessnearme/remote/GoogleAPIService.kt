package com.shubhamsapkal.bussinessnearme.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface GoogleAPIService {

    @GET
    fun getNearByPlaces(@Url url:String): Call<>

}