package com.bhaswat.toolshare.core

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
    NavHost(navController = navController, startDestination = "login") {
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
