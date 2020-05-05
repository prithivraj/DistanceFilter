package data

import model.UserLocations
import com.google.gson.Gson
import model.UserLocation
import okhttp3.OkHttpClient
import okhttp3.Request
import java.lang.Exception

class NetworkRepository : Repository {
    private val okHttp = OkHttpClient()
    private val gson = Gson()
    override fun getUserLocations(): UserLocations {
        val userLocationList = mutableListOf<UserLocation>()
        val request = Request.Builder()
            .url("https://s3.amazonaws.com/intercom-take-home-test/customers.txt")
            .build()
        try {
            val response = okHttp.newCall(request).execute()
            val body = response.body
            body?.let { responseBody ->
                val string = responseBody.string()
                string.lines().forEach {
                    val userLocation = gson.fromJson(it, UserLocation::class.java)
                    userLocationList.add(userLocation)
                }
            }

        } catch (exception: Exception) {
            println("Failed to get data : $exception")
        }
        return UserLocations(userLocationList)
    }
}