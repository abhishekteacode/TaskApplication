package com.example.taskapplication.ModelUser

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class UserDetail {
    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("username")
    @Expose
    private var username: String? = null

    @SerializedName("email")
    @Expose
    private var email: String? = null

    @SerializedName("address")
    @Expose
    private var address: UserAddress? = null

    @SerializedName("phone")
    @Expose
    private var phone: String? = null

    @SerializedName("website")
    @Expose
    private var website: String? = null

    @SerializedName("company")
    @Expose
    private var company: UserCompany? = null

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getUsername(): String? {
        return username
    }

    fun setUsername(username: String?) {
        this.username = username
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String?) {
        this.email = email
    }

    fun getAddress(): UserAddress? {
        return address
    }

    fun setAddress(address: UserAddress?) {
        this.address = address
    }

    fun getPhone(): String? {
        return phone
    }

    fun setPhone(phone: String?) {
        this.phone = phone
    }

    fun getWebsite(): String? {
        return website
    }

    fun setWebsite(website: String?) {
        this.website = website
    }

    fun getCompany(): UserCompany? {
        return company
    }

    fun setCompany(company: UserCompany?) {
        this.company = company
    }

}