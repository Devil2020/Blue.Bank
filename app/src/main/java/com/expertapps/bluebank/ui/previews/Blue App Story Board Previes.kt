package com.expertapps.bluebank.ui.previews

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import com.expertapps.bluebank.R
import com.expertapps.bluebank.app.navigation.routes.PersonalDetailsRoutes
import com.expertapps.bluebank.ui.screens.getstarted.GetStartedScreen
import com.expertapps.bluebank.ui.screens.login.LoginScreen
import com.expertapps.bluebank.ui.screens.onboarding.OnBoardingScreen
import com.expertapps.bluebank.ui.screens.personaldetails.PersonalDetailScreen
import com.expertapps.bluebank.ui.screens.splash.SplashScreen
import com.expertapps.bluebank.ui.screens.verifyindentity.SuccessScreen

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

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Personal Details Cycle 1",
    device = Devices.PHONE,
    group = "PersonalDetails 1"
)
@Composable
fun PreviewPersonalDetails1Screen() {
    PersonalDetailScreen(currentStep = PersonalDetailsRoutes.Steps.YourDetailsRoute)
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Personal Details Cycle 2",
    device = Devices.PHONE,
    group = "PersonalDetails 2"
)
@Composable
fun PreviewPersonalDetails2Screen() {
    PersonalDetailScreen(currentStep = PersonalDetailsRoutes.Steps.VerifyPhoneNumberRoute)
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Personal Details Cycle 3",
    device = Devices.PHONE,
    group = "PersonalDetails 3"
)
@Composable
fun PreviewPersonalDetails3Screen() {
    PersonalDetailScreen(currentStep = PersonalDetailsRoutes.Steps.SetPasswordRoute)
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Success Cycle",
    device = Devices.PHONE,
)
@Composable
fun PreviewSuccessScreen() {
    SuccessScreen(
        title = stringResource(id = R.string.your_account_is_open), body = stringResource(
            id = R.string.you_will_recieve_your_debit
        )
    )
}