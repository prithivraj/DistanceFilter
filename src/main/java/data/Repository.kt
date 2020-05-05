package data

import model.UserLocations
import java.lang.Exception

interface Repository {
    fun getUserLocations(): UserLocations
}