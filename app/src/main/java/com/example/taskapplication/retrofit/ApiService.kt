package com.project.digicard.retrofit


import com.example.taskapplication.ModelPhotos.ImageDetail
import com.example.taskapplication.ModelUser.UserDetail
import retrofit2.Call
import retrofit2.http.*
import java.util.*

interface ApiService {


    @GET(RestConstant.Detail)
    fun showdata(): Call<List<UserDetail>>

    @GET(RestConstant.Photos)
    fun showimagedata(): Call<List<ImageDetail>>


}