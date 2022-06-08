package com.mohsaefudinfikri.retrofitlatihan

import com.google.gson.annotations.SerializedName

data class PostResponse(
    val id: Int,
    val title: String?,
    @SerializedName("body")
    val body: String?
)