package com.shubhamsapkal.bussinessnearme

import com.shubhamsapkal.bussinessnearme.Model.Results
import com.shubhamsapkal.bussinessnearme.Remote.IGoogleAPIService
import com.shubhamsapkal.bussinessnearme.Remote.RetrofitClient


object Common {
    var currentResult: Results? = null

    private val GOOGLE_API_URL="https://maps.googleapis.com/"
    val googleApiService:IGoogleAPIService
    get()=RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}