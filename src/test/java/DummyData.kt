import model.UserLocation
import model.UserLocations

val locations = listOf(
    UserLocation(latitude = 52.986375, userId = 12, name = "Christina McArdle", longitude = -6.043701),
    UserLocation(latitude = 51.92893, userId = 1, name = "Alice Cahill", longitude = -10.27699),
    UserLocation(latitude = 51.8856167, userId = 2, name = "Ian McArdle", longitude = -10.4240951),
    UserLocation(latitude = 52.3191841, userId = 3, name = "Jack Enright", longitude = -8.5072391),
    UserLocation(latitude = 53.807778, userId = 28, name = "Charlie Halligan", longitude = -7.714444),
    UserLocation(latitude = 53.4692815, userId = 7, name = "Frank Kehoe", longitude = -9.436036),
    UserLocation(latitude = 54.0894797, userId = 8, name = "Eoin Ahearn", longitude = -6.18671),
    UserLocation(latitude = 53.038056, userId = 26, name = "Stephen McArdle", longitude = -7.653889),
    UserLocation(latitude = 54.1225, userId = 27, name = "Enid Gallagher", longitude = -8.143333),
    UserLocation(latitude = 53.1229599, userId = 6, name = "Theresa Enright", longitude = -6.2705202),
    UserLocation(latitude = 52.2559432, userId = 9, name = "Jack Dempsey", longitude = -7.1048927),
    UserLocation(latitude = 52.240382, userId = 10, name = "Georgina Gallagher", longitude = -6.972413),
    UserLocation(latitude = 53.2451022, userId = 4, name = "Ian Kehoe", longitude = -6.238335),
    UserLocation(latitude = 53.1302756, userId = 5, name = "Nora Dempsey", longitude = -6.2397222),
    UserLocation(latitude = 53.008769, userId = 11, name = "Richard Finnegan", longitude = -6.1056711),
    UserLocation(latitude = 53.1489345, userId = 31, name = "Alan Behan", longitude = -6.8422408),
    UserLocation(latitude = 53.00, userId = 13, name = "Olive Ahearn", longitude = -7.0),
    UserLocation(latitude = 51.999447, userId = 14, name = "Helen Cahill", longitude = -9.742744),
    UserLocation(latitude = 52.966, userId = 15, name = "Michael Ahearn", longitude = -6.463),
    UserLocation(latitude = 52.366037, userId = 16, name = "Ian Larkin", longitude = -8.179118),
    UserLocation(latitude = 54.180238, userId = 17, name = "Patricia Cahill", longitude = -5.920898),
    UserLocation(latitude = 53.0033946, userId = 39, name = "Lisa Ahearn", longitude = -6.3877505),
    UserLocation(latitude = 52.228056, userId = 18, name = "Bob Larkin", longitude = -7.915833),
    UserLocation(latitude = 54.133333, userId = 24, name = "Rose Enright", longitude = -6.433333),
    UserLocation(latitude = 55.033, userId = 19, name = "Enid Cahill", longitude = -8.112),
    UserLocation(latitude = 53.521111, userId = 20, name = "Enid Enright", longitude = -9.831111),
    UserLocation(latitude = 51.802, userId = 21, name = "David Ahearn", longitude = -9.442),
    UserLocation(latitude = 54.374208, userId = 22, name = "Charlie McArdle", longitude = -8.371639),
    UserLocation(latitude = 53.74452, userId = 29, name = "Oliver Ahearn", longitude = -7.11167),
    UserLocation(latitude = 53.761389, userId = 30, name = "Nick Enright", longitude = -7.2875),
    UserLocation(latitude = 54.080556, userId = 23, name = "Eoin Gallagher", longitude = -6.361944),
    UserLocation(latitude = 52.833502, userId = 25, name = "David Behan", longitude = -8.522366)
)

const val dummyFilteredLocationResult = "UserID : 4 Name : Ian Kehoe\n" +
        "UserID : 5 Name : Nora Dempsey\n" +
        "UserID : 6 Name : Theresa Enright\n" +
        "UserID : 8 Name : Eoin Ahearn\n" +
        "UserID : 11 Name : Richard Finnegan\n" +
        "UserID : 12 Name : Christina McArdle\n" +
        "UserID : 13 Name : Olive Ahearn\n" +
        "UserID : 15 Name : Michael Ahearn\n" +
        "UserID : 17 Name : Patricia Cahill\n" +
        "UserID : 23 Name : Eoin Gallagher\n" +
        "UserID : 24 Name : Rose Enright\n" +
        "UserID : 26 Name : Stephen McArdle\n" +
        "UserID : 29 Name : Oliver Ahearn\n" +
        "UserID : 30 Name : Nick Enright\n" +
        "UserID : 31 Name : Alan Behan\n" +
        "UserID : 39 Name : Lisa Ahearn"
val dummyLocations: UserLocations =
    UserLocations(userLocations = locations)