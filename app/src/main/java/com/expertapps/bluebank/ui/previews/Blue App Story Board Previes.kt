package com.expertapps.bluebank.ui.previews

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import com.expertapps.bluebank.ui.screens.getstarted.GetStartedScreen
import com.expertapps.bluebank.ui.screens.login.LoginScreen
import com.expertapps.bluebank.ui.screens.splash.SplashScreen

@Preview(showBackground = true , showSystemUi = true , name = "Splash Cycle" , device = Devices.PHONE , group = "Board1")
@Composable
fun PreviewSplash(){
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        SplashScreen()
    }
}

@Preview(showBackground = true , showSystemUi = true , name = "Get Started Cycle" , device = Devices.PHONE , group = "Board1")
@Composable
fun PreviewGetStartedScreen(){
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        GetStartedScreen()
    }
}
@Preview(showBackground = true , showSystemUi = true , name = "Login Cycle" , device = Devices.PHONE , group = "Board1")
@Composable
fun PreviewLoginScreen(){
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        LoginScreen()
    }
}