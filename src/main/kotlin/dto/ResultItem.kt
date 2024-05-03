package dto


import com.squareup.moshi.Json

data class ResultItem(
    @Json(name = "license")
    val license: License?,
    @Json(name = "meanings")
    val meanings: List<Meaning>?,
    @Json(name = "phonetic")
    val phonetic: String?,
    @Json(name = "phonetics")
    val phonetics: List<Phonetic>?,
    @Json(name = "sourceUrls")
    val sourceUrls: List<String>?,
    @Json(name = "word")
    val word: String?
)