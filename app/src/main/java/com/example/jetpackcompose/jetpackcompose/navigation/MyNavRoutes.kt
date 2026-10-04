package com.example.jetpackcompose.jetpackcompose.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class MyNavRoutes {
    @Serializable
    object LoginScreen : MyNavRoutes()


    @Serializable
    object HomeScreen : MyNavRoutes()

    @Serializable
    data class WelcomeScreen(val userName: String) : MyNavRoutes()
}



