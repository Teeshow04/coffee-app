package com.example.jetpackcompose.jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun NavGraph(){

    //navController -> Handle Navigation
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen
    ){
       composable<MyNavRoutes.LoginScreen>{
           LoginScreen(navController)
       }
        composable<MyNavRoutes.HomeScreen>{
            HomeScreen(navController)
        }
        //backStackEntry is a Lambda Function having data and arguments
        // which are passed during Navigation
        composable <MyNavRoutes.WelcomeScreen>{
            backStackEntry ->
            val data = backStackEntry.toRoute<MyNavRoutes.WelcomeScreen>()
            WelcomeScreen(data.userName, navController)
        }

       }

}