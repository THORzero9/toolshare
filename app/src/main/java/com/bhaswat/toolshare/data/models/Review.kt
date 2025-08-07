package com.bhaswat.toolshare.data.models

data class Review(
    val id: String,
    val toolId: String,
    val userId: String,
    val rating: Int,
    val comment: String
)
