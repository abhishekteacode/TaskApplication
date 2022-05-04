package com.example.taskapplication.ModelUser

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class AddressGeo {
    @SerializedName("lat")
    @Expose
    private var lat: String? = null

    @SerializedName("lng")
    @Expose
    private var lng: String? = null

    fun getLat(): String? {
        return lat
    }

    fun setLat(lat: String?) {
        this.lat = lat
    }

    fun getLng(): String? {
        return lng
    }

    fun setLng(lng: String?) {
        this.lng = lng
    }

}