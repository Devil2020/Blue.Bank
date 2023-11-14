package com.expertapps.bluebank.app.navigation.routes


object ApplicationStartRoutes {
    object SplashRoute : Route(SplashRoute::class.java.name)
    object GetStartedRoute : Route(GetStartedRoute::class.java.name)
    object LoginRoute : Route(LoginRoute::class.java.name)
}

object OnBoardingRoutes {
    object ChooseBankAccountRoute : Route(ChooseBankAccountRoute::class.java.name)
    object ChooseAgeRoute : Route(ChooseAgeRoute::class.java.name)
    object ChooseAccountTypeRoute : Route(ChooseAccountTypeRoute::class.java.name)
    object ChooseSavingTypesRoute : Route(ChooseSavingTypesRoute::class.java.name)
    object RecommendationAccountsRoute : Route(RecommendationAccountsRoute::class.java.name)
}

object PersonalDetailsRoutes {
    object YourDetailsRoute : Route(YourDetailsRoute::class.java.name)
    object VerifyPhoneNumberRoute : Route(VerifyPhoneNumberRoute::class.java.name)
    object SetPasswordRoute : Route(SetPasswordRoute::class.java.name)
}

object VerifyIdentityRoutes {
    object YourIdentityRoute : Route(YourIdentityRoute::class.java.name)
    object IdDocumentsForVerificationRoute : Route(IdDocumentsForVerificationRoute::class.java.name)
    object SuccessRoute : Route(SuccessRoute::class.java.name)
}