package com.bhaswat.toolshare.data.models

data class Tool(
    val id: String,
    val name: String,
    val description: String,
    val ownerId: String,
    val category: String,
    val condition: String,
    val available: Boolean,
    val imageUrls: List<String>,
    val location: Location
)

data class Location(
    val latitude: Double,
    val longitude: Double
)
