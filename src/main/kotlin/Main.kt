package org.example

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dto.Problem
import dto.ResultItem
import dto.Results
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

fun main() {
    println("Hello World!")

    val typeProblem = Types.newParameterizedType(List::class.java, Problem::class.java, Problem::class.java)
    //val typeList = Types.newParameterizedType(List::class.java, Results::class.java, ResultItem::class.java)

    val moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    //val annotationData = jsonAdapter.fromJson(labelAnnotation.toString())
    //val jsonAdapterList: JsonAdapter<ArrayList<ResultItem>> = moshi.adapter(typeList)
    val jsonAdapterProblem: JsonAdapter<Problem> = moshi.adapter(typeProblem)

    val req = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl("https://api.dictionaryapi.dev")
        .build()
        .create(TranslationApi::class.java)

    val call = req.translate(
        //word = "fox",
        word = "neuf",
        language = "fr"
    )

    // This is a super-duper comment

    val resp = call.execute()
    if (resp.isSuccessful)
    {
        print(resp.body())
        print(resp.body() is List<*>)
    }

}