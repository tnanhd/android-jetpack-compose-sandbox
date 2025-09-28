package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object Profile

@Serializable
object FriendsList

@Composable
fun NavigationAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Profile
    ) {
        composable<Profile> {
            ProfileScreen(
                onNavigateToFriendsList = {
                    navController.navigate(FriendsList)
                }
            )
        }
        composable<FriendsList> {
            FriendsListScreen(
                onNavigateBack = {
                    if (navController.currentBackStackEntry?.lifecycle?.currentState ==
                        Lifecycle.State.RESUMED
                    ) {
                        navController.popBackStack()
                    }
                }
            )
        }
    }
}