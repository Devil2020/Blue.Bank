package com.expertapps.bluebank.ui.previews

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.expertapps.bluebank.ui.screens.getstarted.GetStartedScreen
import com.expertapps.bluebank.ui.screens.splash.SplashScreen

@Preview(showBackground = true , showSystemUi = true , name = "Splash Cycle" , device = Devices.PHONE , group = "Board1")
@Composable
fun PreviewSplash(){
        SplashScreen()
}

@Preview(showBackground = true , showSystemUi = true , name = "Splash Cycle" , device = Devices.PHONE , group = "Board1")
@Composable
fun PreviewGetStartedScreen(){
    GetStartedScreen()
}