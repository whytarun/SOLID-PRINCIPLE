/*
    A class should have one and only one reason to change
    sample square class, RoomDB class, location manager Class
 */

class Square{
    fun calculateArea(side:Int) :Int =  side * side
    fun calculateParameter(side: Int) :Int = 4* side
    /*
        below method are ui related so they are moved to ui class
     */
//    fun renderSquare() = println("render square")
//    fun renderLargeSquare() = println("render square")
}

class SquareUi{
    fun renderSquare() = println("render square")
    fun renderLargeSquare() = println("render square")
}

//class AndroidLocationManager(context: Context) : LocationManager {
//
//    private val fusedLocationClient: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)
//
//    private val geocoder = Geocoder(context, Locale.getDefault())
//
//    @SuppressLint("MissingPermission")
//    override suspend fun getLastLocation(): Location = suspendCoroutine { continuation ->
//        fusedLocationClient.lastLocation
//            .addOnSuccessListener { location ->
//                if (location == null)
//                    continuation.resumeWithException(Exception("Location not available"))
//                else
//                    continuation.resume(Location(location.latitude, location.longitude))
//            }
//            .addOnFailureListener {
//                continuation.resumeWithException(it)
//            }
//    }
//
//    override suspend fun getCities(location: Location): List<City> = withContext(Dispatchers.IO) {
//        geocoder.getFromLocation(location.lat, location.lon, 10)
//            .filter { it.locality != null }
//            .map {
//                City(it.locality, it.countryCode)
//            }
//    }
//}