package com.example.api

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.example.api.RetrofitBloger.ApiClientBlog
import com.example.api.RetrofitBloger.ApiInterfaceBlog
import com.example.api.RetrofitBloger.ItemModelData
import com.example.api.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        window.statusBarColor = ContextCompat.getColor(this, R.color.black)

        binding.btn.setOnClickListener {
            getData()
            binding.ProgreesBar.isVisible = true
        }
    }

    fun getData() {
        var apiInterface = ApiClientBlog().getRetrofit().create(ApiInterfaceBlog::class.java)

        apiInterface.getitem("AIzaSyD32tn7AbtNl_QDZb1LpFbdUHkzSHM_j9c")
            .enqueue(object : Callback<ItemModelData> {
                override fun onResponse(
                    call: Call<ItemModelData>,
                    response: Response<ItemModelData>
                ) {
                    var list = response.body()!!
                    Log.e("TAG", "onResponse: $list")

                    binding.ProgreesBar.isVisible = false


                    binding.blogTxt.text = list.toString()
                }

                override fun onFailure(call: Call<ItemModelData>, t: Throwable) {
                    Log.e("TAG", "onFailure: ${t.message}")
                }
            })
    }
}