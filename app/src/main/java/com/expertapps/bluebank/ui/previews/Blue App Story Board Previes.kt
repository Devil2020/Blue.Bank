package com.expertapps.bluebank.ui.previews

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import com.expertapps.bluebank.ui.screens.getstarted.GetStartedScreen
import com.expertapps.bluebank.ui.screens.login.LoginScreen
import com.expertapps.bluebank.ui.screens.onboarding.OnBoardingScreen
import com.expertapps.bluebank.ui.screens.splash.SplashScreen

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Splash Cycle",
    device = Devices.PHONE,
    group = "Board1"
)
@Composable
fun PreviewSplash() {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        SplashScreen()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Get Started Cycle",
    device = Devices.PHONE,
    group = "Board1"
)
@Composable
fun PreviewGetStartedScreen() {
    GetStartedScreen()
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Login Cycle",
    device = Devices.PHONE,
    group = "Board1"
)
@Composable
fun PreviewLoginScreen() {
    LoginScreen()
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "OnBoarding Cycle 1",
    device = Devices.PHONE,
    group = "OnBoarding 1"
)
@Composable
fun PreviewOnBoardingStep1Screen() {
    OnBoardingScreen(currentStepValue = 0)
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "OnBoarding Cycle 2",
    device = Devices.PHONE,
    group = "OnBoarding 2"
)
@Composable
fun PreviewOnBoardingStep2Screen() {
    OnBoardingScreen(currentStepValue = 1)
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "OnBoarding Cycle 3",
    device = Devices.PHONE,
    group = "OnBoarding 3"
)
@Composable
fun PreviewOnBoardingStep3Screen() {
    OnBoardingScreen(currentStepValue = 2)
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "OnBoarding Cycle 4",
    device = Devices.PHONE,
    group = "OnBoarding 4"
)
@Composable
fun PreviewOnBoardingStep4Screen() {
    OnBoardingScreen(currentStepValue = 3)
}
@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "OnBoarding Cycle 5",
    device = Devices.PHONE,
    group = "OnBoarding 5"
)
@Composable
fun PreviewOnBoardingStep5Screen() {
    OnBoardingScreen(currentStepValue = 4)
}