package org.example

import dto.ResultItem

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TranslationApi {
    @GET("/api/v2/entries/{language}/{word}")
    fun translate(
        @Path("word") word: String,
        @Path("language") language: String = "en",
    // ): Call<List<ResultItem>>
    ): Call<Any>

}