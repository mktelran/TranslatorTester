package org.example.dto

import com.squareup.moshi.Json
import dto.Problem
import dto.Results

data class Response(
    val result: Results? = null,
    val problem: Problem? = null
)