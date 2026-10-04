package com.example.jetpackcompose.models

object MockData {
    val products = listOf(
        Product(
            id = 1,
            title = "Essence Mascara Lash Princess",
            description = "The Essence Mascara Lash Princess is a popular mascara known for its volumizing and lengthening effects.",
            category = "beauty",
            price = 9.99,
            discountPercentage = 7.17,
            rating = 4.94,
            stock = 5,
            tags = listOf("beauty", "mascara"),
            brand = "Essence",
            sku = "RCH45Q1A",
            weight = 2,
            dimensions = Dimensions(depth = 1.0, height = 1.0, width = 1.0),
            warrantyInformation = "1 month warranty",
            shippingInformation = "Ships in 1 month",
            availabilityStatus = "In Stock",
            reviews = emptyList(),
            returnPolicy = "30 days return policy",
            minimumOrderQuantity = 24,
            meta = Meta(barcode = "123456789", createdAt = "2024-05-23T08:56:21.618Z", qrCode = "...", updatedAt = "2024-05-23T08:56:21.618Z"),
            images = listOf("https://cdn.dummyjson.com/products/images/beauty/Essence%20Mascara%20Lash%20Princess/1.png"),
            thumbnail = "https://cdn.dummyjson.com/products/images/beauty/Essence%20Mascara%20Lash%20Princess/thumbnail.png"
        ),
        Product(
            id = 2,
            title = "Eyeshadow Palette with 73 Colors",
            description = "Very good palette for professional use.",
            category = "beauty",
            price = 19.99,
            discountPercentage = 5.5,
            rating = 4.5,
            stock = 10,
            tags = listOf("beauty", "eyeshadow"),
            brand = "Glamour",
            sku = "EYE73",
            weight = 1,
            dimensions = Dimensions(depth = 0.5, height = 5.0, width = 8.0),
            warrantyInformation = "6 months warranty",
            shippingInformation = "Ships in 2 days",
            availabilityStatus = "In Stock",
            reviews = emptyList(),
            returnPolicy = "30 days return policy",
            minimumOrderQuantity = 1,
            meta = Meta(barcode = "987654321", createdAt = "2024-05-23T08:56:21.618Z", qrCode = "...", updatedAt = "2024-05-23T08:56:21.618Z"),
            images = listOf("https://cdn.dummyjson.com/products/images/beauty/Eyeshadow%20Palette%20with%2073%20Colors/1.png"),
            thumbnail = "https://cdn.dummyjson.com/products/images/beauty/Eyeshadow%20Palette%20with%2073%20Colors/thumbnail.png"
        )
    )
}
