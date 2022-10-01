package com.example.api.RetrofitBloger

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterfaceBlog {

    @GET("posts")
    fun getitem(@Query ("key") key : String) : Call<ItemModelData>
}
