package com.expertapps.bluebank.app.navigation.directions

import androidx.navigation.NavController
import com.expertapps.bluebank.app.navigation.routes.ApplicationStartRoutes
import com.expertapps.bluebank.app.navigation.routes.OnBoardingRoute

object BlueBankDirections {

    fun openGetStartedScreen(controller: NavController) {
        with(controller) {
            ApplicationStartRoutes.GetStartedRoute.navigateAndPopCurrent()
        }
    }

    fun openLoginScreen(controller: NavController) {
        with(controller) {
            ApplicationStartRoutes.LoginRoute.navigate()
        }
    }


    fun openOnBoardingScreen(controller: NavController) {
        with(controller) {
            OnBoardingRoute.navigate()
        }
    }
}