package com.expertapps.bluebank.app.navigation.routes

import androidx.navigation.NavController

open class Route (val name : String) {

    context(NavController)
    fun navigate () = navigate(name)

    context(NavController)
    fun pop() = popBackStack()

}