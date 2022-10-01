package com.example.api.RetrofitBloger

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClientBlog {
    var Base_Url = "https://www.googleapis.com/blogger/v3/blogs/1871023411115012444/"

    fun getRetrofit(): Retrofit {
        var retrofit =
            Retrofit.Builder().baseUrl(Base_Url).addConverterFactory(GsonConverterFactory.create())
                .build()

        return retrofit
    }
}