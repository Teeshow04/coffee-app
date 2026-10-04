package com.example.jetpackcompose.models

import kotlinx.serialization.Serializable

@Serializable
data class ProductResponse(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)