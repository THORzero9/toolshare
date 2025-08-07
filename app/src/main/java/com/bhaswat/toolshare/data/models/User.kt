package com.bhaswat.toolshare.data.models

data class User(
    val id: String,
    val name: String,
    val email: String,
    val profilePictureUrl: String?,
    val rating: Double
)
