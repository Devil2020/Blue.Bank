package com.expertapps.bluebank.ui.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.expertapps.bluebank.ui.screens.splash.SplashScreen

@Preview(showBackground = true , showSystemUi = true , name = "Splash Cycle" , device = Devices.NEXUS_6)
@Composable
fun PreviewSplash(){
    SplashScreen()
}