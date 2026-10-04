package com.example.jetpackcompose.jetpackcompose.NavigationBar

import android.content.ClipData
import android.media.RouteListingPreference
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.navigation.NavHostController

@Composable
fun MyNavBar(navController: NavHostController, key: String) {
    val navItems= listOf(
        NavItem("Home", Icons.Default.Home, NavBarRoutes.Home),
        NavItem("Search", Icons.Default.Search, NavBarRoutes.Search),
        NavItem("Notifications", Icons.Default.Notifications, NavBarRoutes.Notification),
        NavItem("Profile", Icons.Default.Person, NavBarRoutes.Profile),
    )

    NavigationBar {
        navItems.forEach {item ->
            NavigationBarItem(
                selected = item.title == key,
                onClick = { navController.navigate(item.routes){
                    popUpTo(navController.graph.startDestinationId)
                }

                          },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = "Home"
                    )},
                label = { Text(text = item.title)},
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedTextColor = Color.Blue,
                    selectedIconColor = Color.Blue,
                    indicatorColor = Color.Blue.copy(alpha = 0.1f),
                    unselectedTextColor = Color.Red,
                    unselectedIconColor = Color.Red

                )
            )
        }
    }

}

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val routes: NavBarRoutes
)