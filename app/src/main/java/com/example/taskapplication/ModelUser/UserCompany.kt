package com.example.taskapplication.ModelUser

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class UserCompany {
    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("catchPhrase")
    @Expose
    private var catchPhrase: String? = null

    @SerializedName("bs")
    @Expose
    private var bs: String? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getCatchPhrase(): String? {
        return catchPhrase
    }

    fun setCatchPhrase(catchPhrase: String?) {
        this.catchPhrase = catchPhrase
    }

    fun getBs(): String? {
        return bs
    }

    fun setBs(bs: String?) {
        this.bs = bs
    }
}