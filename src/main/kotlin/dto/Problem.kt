package dto


import com.squareup.moshi.Json

data class Problem(
    @Json(name = "message")
    val message: String,
    @Json(name = "resolution")
    val resolution: String,
    @Json(name = "title")
    val title: String
)