package com.example.taskapplication.ModelUser

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class UserAddress {

    @SerializedName("street")
    @Expose
    private var street: String? = null

    @SerializedName("suite")
    @Expose
    private var suite: String? = null

    @SerializedName("city")
    @Expose
    private var city: String? = null

    @SerializedName("zipcode")
    @Expose
    private var zipcode: String? = null

    @SerializedName("geo")
    @Expose
    private var geo: AddressGeo? = null

    fun getStreet(): String? {
        return street
    }

    fun setStreet(street: String?) {
        this.street = street
    }

    fun getSuite(): String? {
        return suite
    }

    fun setSuite(suite: String?) {
        this.suite = suite
    }

    fun getCity(): String? {
        return city
    }

    fun setCity(city: String?) {
        this.city = city
    }

    fun getZipcode(): String? {
        return zipcode
    }

    fun setZipcode(zipcode: String?) {
        this.zipcode = zipcode
    }

    fun getGeo(): AddressGeo? {
        return geo
    }

    fun setGeo(geo: AddressGeo?) {
        this.geo = geo
    }
}