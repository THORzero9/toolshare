package com.bhaswat.toolshare.core

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.bhaswat.toolshare.authentication.AuthScreen
import com.bhaswat.toolshare.authentication.SignUpScreen
import com.bhaswat.toolshare.community.CommunityScreen
import com.bhaswat.toolshare.lending.LendingScreen
import com.bhaswat.toolshare.notifications.NotificationsScreen
import com.bhaswat.toolshare.profile.ProfileScreen
import com.bhaswat.toolshare.sustainability.SustainabilityScreen
import com.bhaswat.toolshare.wishlist.WishlistScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute !in listOf("login", "signup")) {
                BottomNavigationBar(navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "login",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("login") { AuthScreen(navController) }
            composable("signup") { SignUpScreen(navController) }
            composable("community") { CommunityScreen() }
            composable("lending") { LendingScreen() }
            composable("notifications") { NotificationsScreen() }
            composable("profile") { ProfileScreen() }
            composable("sustainability") { SustainabilityScreen() }
            composable("wishlist") { WishlistScreen() }
        }
    }
}
