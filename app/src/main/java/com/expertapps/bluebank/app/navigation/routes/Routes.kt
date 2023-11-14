package com.expertapps.bluebank.app.navigation.routes


object ApplicationStartRoutes {
    object SplashRoute : Route(SplashRoute::class.java.name)
    object GetStartedRoute : Route(GetStartedRoute::class.java.name)
    object LoginRoute : Route(LoginRoute::class.java.name)
}

object OnBoardingRoute : Route(OnBoardingRoute::class.java.name) {
    enum class Steps(selectionCount : Int) {
         ChooseBankAccountPage(1) ,
         ChooseAgePage(2) ,
         ChooseAccountTypePage (3) ,
         ChooseSavingTypesPage (4) ,
         RecommendationAccountsPage (5)
    }
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