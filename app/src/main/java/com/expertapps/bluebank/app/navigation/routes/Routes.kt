package com.expertapps.bluebank.app.navigation.routes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.res.stringResource
import com.expertapps.bluebank.R
import com.expertapps.bluebank.ui.screens.onboarding.models.Option


object ApplicationStartRoutes {
    object SplashRoute : Route(SplashRoute::class.java.name)
    object GetStartedRoute : Route(GetStartedRoute::class.java.name)
    object LoginRoute : Route(LoginRoute::class.java.name)
}

object OnBoardingRoute : Route(OnBoardingRoute::class.java.name) {
    sealed class Steps {
        lateinit var title: String
        lateinit var subTitle: String
        lateinit var question: String

        data class ChooseBankAccountPage(
            val options: List<Option>,
            var selectedOption: State<Option?> = mutableStateOf(null)
        ) : Steps()

        data class ChooseAgePage(
            val options: List<Option>,
            var selectedOption: State<Option?> = mutableStateOf(null)
        ) : Steps()

        data class ChooseAccountTypePage(
            val options: List<Option>,
            var selectedOption: State<Option?> = mutableStateOf(null)
        ) : Steps()

        data class ChooseSavingTypesPage(
            val options: List<Option>,
            var selectedOption: State<Option?> = mutableStateOf(null)
        ) : Steps()

        object RecommendationAccountsPage : Steps()
    }

    @Composable
    fun getSteps() = arrayListOf(
        createChooseBankAccountPage(),
        createChooseYourAgePage(),
        createChooseAccountTypePage(),
        createSavingTypesPage(),
        createRecommendAccountsPage()
    )

    @Composable
    private fun createChooseBankAccountPage() = Steps.ChooseBankAccountPage(
        arrayListOf(
            Option(title = stringResource(id = R.string.single_account)),
            Option(title = stringResource(id = R.string.joint_Account))
        )
    ).apply {
        title = stringResource(id = R.string.choose_bank_account_title)
        subTitle = stringResource(id = R.string.choose_bank_account_subtitle)
        question = stringResource(id = R.string.choose_bank_account_questions)
    }

    @Composable
    private fun createChooseYourAgePage() = Steps.ChooseAgePage(
        arrayListOf(
            Option(title = stringResource(id = R.string.under_14)),
            Option(title = stringResource(id = R.string._14_17)),
            Option(title = stringResource(id = R.string._18_29)),
            Option(title = stringResource(id = R.string._30_54)),
            Option(title = stringResource(id = R.string._55_to_over)),
        )
    ).apply {
        title = stringResource(id = R.string.choose_age_title)
        subTitle = stringResource(id = R.string.choose_age_subtitle)
        question = stringResource(id = R.string.choose_age_question)
    }

    @Composable
    private fun createChooseAccountTypePage() = Steps.ChooseAgePage(
        arrayListOf(
            Option(
                title = stringResource(id = R.string.saving),
                subTitle = stringResource(id = R.string.earning_intereist)
            ),
            Option(
                title = stringResource(id = R.string.every_day_transactions),
                subTitle = stringResource(id = R.string.deposit_finds)
            ),
            Option(
                title = stringResource(id = R.string.every_day_transactions_and_savings),
                subTitle = stringResource(id = R.string.every_day_use_credit_card)
            ),
        )
    ).apply {
        title = stringResource(id = R.string.choose_account_type_title)
        subTitle = stringResource(id = R.string.choose_account_type_subtitle)
        question = stringResource(id = R.string.choose_account_type_question)
    }

    @Composable
    private fun createSavingTypesPage() = Steps.ChooseAgePage(
        arrayListOf(
            Option(
                title = stringResource(id = R.string.a_short_term),
            ),
            Option(
                title = stringResource(id = R.string.somthing_fixed),
            ),
        )
    ).apply {
        title = stringResource(id = R.string.choose_saving_types_title)
        subTitle = stringResource(id = R.string.choose_saving_types_subtitle)
        question = stringResource(id = R.string.choose_saving_types_question)
    }

    @Composable
    private fun createRecommendAccountsPage() = Steps.RecommendationAccountsPage.apply {
        title = stringResource(id = R.string.choose_recommended_account_title)
        subTitle = stringResource(id = R.string.choose_recommended_account_subtitle)
        question = stringResource(id = R.string.bundled_amount)
    }

}

object PersonalDetailsRoutes : Route(PersonalDetailsRoutes::class.java.name) {
    enum class Steps {
        YourDetailsRoute,
        VerifyPhoneNumberRoute,
        SetPasswordRoute
    }
}

object VerifyIdentityRoutes {
    object YourIdentityRoute : Route(YourIdentityRoute::class.java.name)
    object IdDocumentsForVerificationRoute : Route(IdDocumentsForVerificationRoute::class.java.name)
    object SuccessRoute : Route(SuccessRoute::class.java.name)
}