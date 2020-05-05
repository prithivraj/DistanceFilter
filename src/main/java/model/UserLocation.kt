package model

import com.google.gson.annotations.SerializedName
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.sin

data class UserLocations(
    val userLocations: List<UserLocation>
)

data class UserLocation(
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("user_id")
    val userId: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("longitude")
    val longitude: Double
)