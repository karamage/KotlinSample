package com.example.masaakikakimoto.kotlinsample.client

import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import com.example.masaakikakimoto.kotlinsample.model.Article

/**
 * Created by masaakikakimoto on 2017/07/23.
 */

interface ArticleClient {
    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}