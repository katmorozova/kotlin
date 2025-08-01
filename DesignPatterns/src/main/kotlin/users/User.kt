package org.example.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("id") val id: Int,
    @SerialName("first_name") val name: String,
    @SerialName("last_name") val lastName: String,
    @SerialName("age") val age: Int
)