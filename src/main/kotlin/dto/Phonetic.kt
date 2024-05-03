package dto


import com.squareup.moshi.Json

data class Phonetic(
    @Json(name = "audio")
    val audio: String?,
    @Json(name = "license")
    val license: License?,
    @Json(name = "sourceUrl")
    val sourceUrl: String?,
    @Json(name = "text")
    val text: String?
)