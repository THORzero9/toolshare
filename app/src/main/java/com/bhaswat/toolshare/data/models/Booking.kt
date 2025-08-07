package com.bhaswat.toolshare.data.models

import java.util.Date

data class Booking(
    val id: String,
    val toolId: String,
    val borrowerId: String,
    val ownerId: String,
    val startDate: Date,
    val endDate: Date,
    val status: BookingStatus
)

enum class BookingStatus {
    PENDING,
    APPROVED,
    DECLINED,
    RETURNED
}
