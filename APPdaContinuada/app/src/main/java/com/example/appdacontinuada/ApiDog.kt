package com.example.appdacontinuada



import retrofit2.Call
import retrofit2.http.GET

interface ApiDog {
    @GET("cachorros")
    fun get(): Call<List<Cachorros>>

}