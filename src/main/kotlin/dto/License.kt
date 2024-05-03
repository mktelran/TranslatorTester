package dto


import com.squareup.moshi.Json

data class License(
    @Json(name = "name")
    val name: String?,
    @Json(name = "url")
    val url: String?
)