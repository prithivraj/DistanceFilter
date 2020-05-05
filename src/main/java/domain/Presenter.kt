package domain

import data.FileStore
import data.Repository
import model.*
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.sin

class Presenter(
    private val repository: Repository,
    private val fileStore: FileStore
) {
    fun compute() {
        val result = repository.getUserLocations()
            .userLocations
            .filter {
                it.distanceFrom(
                    DUBLIN_OFFICE_LAT,
                    DUBLIN_OFFICE_LONG
                ) < MAX_DISTANCE
            }
            .sortedBy { it.userId }
            .map { "UserID : ${it.userId} Name : ${it.name}\n" }
            .fold("") { prev, curr ->
                prev + curr
            }
            .trim()
        fileStore.writeToFile(result)
    }
}

fun UserLocation.distanceFrom(sourceLatitude: Double, sourceLongitude: Double): Double {
    val phi1 = Math.toRadians(sourceLatitude)
    val lambda1 = Math.toRadians(sourceLongitude)

    val phi2 = Math.toRadians(latitude)
    val lambda2 = Math.toRadians(longitude)

    val deltaLambda = abs(lambda2 - lambda1)
    val deltaSigma = acos((sin(phi1) * sin(phi2)) + (cos(phi1) * cos(phi2) * cos(deltaLambda)))
    return RADIUS_EARTH.times(deltaSigma)
}