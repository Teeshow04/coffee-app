package com.example.jetpackcompose

import com.example.jetpackcompose.models.MockData
import com.example.jetpackcompose.models.Product
import com.example.jetpackcompose.models.ProductResponse
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

suspend fun fetchAllProducts(skip: Int = 0, limit: Int = 20): List<Product> {
    return try {
        val response = KtorClientInstance.client.get("https://dummyjson.com/products") {
            parameter("skip", skip)
            parameter("limit", limit)
        }.body<ProductResponse>()
        response.products
    } catch (e: Exception) {
        println("Network fetch failed: ${e.message}. Using mock data fallback.")
        // Return a subset of mock data based on pagination if possible, 
        // or just the whole list for the first page
        if (skip == 0) MockData.products else emptyList()
    }
}
