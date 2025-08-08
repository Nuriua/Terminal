package com.nuriua.terminal.data

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET(
        "aggs/ticker/AAPL/range/{timeframe}/2022-01-09/2024-01-09?adjusted=true&sort=desc&limit=50000&apiKey=5QNsV9F1cUGQ3XQEG5apybRKp98idRNM")
    suspend fun loadBars(
        @Path("timeframe") timeFrame: String
    ): Result
}