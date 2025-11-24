package com.alnod.buybloom.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alnod.buybloom.ui.screens.about.AboutScreen
import com.alnod.buybloom.ui.screens.category.CategoryScreen
import com.alnod.buybloom.ui.screens.home.HomeScreen
import com.alnod.buybloom.ui.screens.products.ProductsScreen
import com.alnod.buybloom.ui.screens.service.ServiceScreen
import com.alnod.buybloom.ui.screens.splash.SplashScreen
import com.alnod.buybloom.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {


    NavHost(navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_PRODUCTS) {
            ProductsScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }


    }
}