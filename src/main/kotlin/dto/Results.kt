package dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Results : ArrayList<ResultItem>()