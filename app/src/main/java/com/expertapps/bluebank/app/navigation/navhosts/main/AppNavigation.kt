package com.expertapps.bluebank.app.navigation.navhosts.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.expertapps.bluebank.app.navigation.directions.BlueBankDirections
import com.expertapps.bluebank.app.navigation.routes.ApplicationStartRoutes
import com.expertapps.bluebank.app.navigation.routes.OnBoardingRoute
import com.expertapps.bluebank.ui.screens.getstarted.GetStartedScreen
import com.expertapps.bluebank.ui.screens.login.LoginScreen
import com.expertapps.bluebank.ui.screens.onboarding.OnBoardingScreen
import com.expertapps.bluebank.ui.screens.splash.SplashScreen

@Composable
fun BlueBankNavigation() {
    val controller = rememberNavController()
    NavHost(
        navController = controller,
        startDestination = ApplicationStartRoutes.SplashRoute.name
    ) {
        composable(ApplicationStartRoutes.SplashRoute.name) {
            SplashScreen(navigate = { BlueBankDirections.openGetStartedScreen(controller) })
        }
        composable(ApplicationStartRoutes.GetStartedRoute.name) {
            GetStartedScreen(loginClick = {
                 BlueBankDirections.openLoginScreen(controller)
            }, startClick = {
                BlueBankDirections.openOnBoardingScreen(controller)
            })
        }
        composable(ApplicationStartRoutes.LoginRoute.name) {
            LoginScreen {

            }
        }
        composable(OnBoardingRoute.name) {
            OnBoardingScreen()
        }
    }
}