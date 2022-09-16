package com.jemma.booksearch.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

// Json 만으로는 Kotlin에서 변환이 안되기 때문에 field:를 앞에 붙여줌
@JsonClass(generateAdapter = true)
data class Document(
    @field:Json(name = "authors")
    val authors: List<String>,
    @field:Json(name = "contents")
    val contents: String,
    @field:Json(name = "datetime")
    val datetime: String,
    @field:Json(name = "isbn")
    val isbn: String,
    @field:Json(name = "price")
    val price: Int,
    @field:Json(name = "publisher")
    val publisher: String,
    @field:Json(name = "sale_price")
    val salePrice: Int,
    @field:Json(name = "status")
    val status: String,
    @field:Json(name = "thumbnail")
    val thumbnail: String,
    @field:Json(name = "title")
    val title: String,
    @field:Json(name = "translators")
    val translators: List<String>,
    @field:Json(name = "url")
    val url: String
)