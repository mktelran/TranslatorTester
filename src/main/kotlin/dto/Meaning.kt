package dto


import com.squareup.moshi.Json

data class Meaning(
    @Json(name = "antonyms")
    val antonyms: List<String>?,
    @Json(name = "definitions")
    val definitions: List<Definition>?,
    @Json(name = "partOfSpeech")
    val partOfSpeech: String?,
    @Json(name = "synonyms")
    val synonyms: List<String>?
)