package com.expertapps.bluebank.app.navigation.navhosts.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.expertapps.bluebank.app.navigation.routes.ApplicationStartRoutes
import com.expertapps.bluebank.ui.screens.getstarted.GetStartedScreen
import com.expertapps.bluebank.ui.screens.login.LoginScreen
import com.expertapps.bluebank.ui.screens.splash.SplashScreen

@Composable
fun BlueBankNavigation (){
    val controller = rememberNavController()
    NavHost(navController = controller , startDestination = ApplicationStartRoutes.SplashRoute.name ){
        composable(ApplicationStartRoutes.SplashRoute.name){
            SplashScreen{
                controller.navigate(ApplicationStartRoutes.GetStartedRoute.name)
            }
        }
        composable(ApplicationStartRoutes.GetStartedRoute.name){
            GetStartedScreen()
        }
        composable(ApplicationStartRoutes.LoginRoute.name){
            LoginScreen()
        }
    }
}