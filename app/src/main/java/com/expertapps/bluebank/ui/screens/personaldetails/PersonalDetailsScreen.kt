package com.expertapps.bluebank.ui.screens.personaldetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.expertapps.bluebank.R
import com.expertapps.bluebank.app.navigation.routes.PersonalDetailsRoutes
import com.expertapps.bluebank.ui.components.FilledButton

@Preview(showBackground = true, showSystemUi = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonalDetailScreen(
    modifier: Modifier = Modifier,
    currentStep: PersonalDetailsRoutes.Steps = PersonalDetailsRoutes.Steps.YourDetailsRoute
) {
    val scrollState = rememberScrollState()
    ConstraintLayout(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .then(modifier)
    ) {
        val (actionBar, actionButton, content) = createRefs()

        TopAppBar(title = { }, navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "Back",
                tint = Color.Black
            )
        }, modifier = Modifier.constrainAs(actionBar) {
            top.linkTo(parent.top)
            linkTo(parent.start, parent.end)
            width = Dimension.fillToConstraints
        }, colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.White))

        PersonalDetailsContent(modifier = Modifier
            .verticalScroll(scrollState)
            .constrainAs(content) {
                linkTo(actionBar.bottom, actionButton.top)
                linkTo(parent.start, parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            } , currentStep)

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .shadow(10.dp)
                .constrainAs(actionButton) {
                    bottom.linkTo(parent.bottom)
                    linkTo(parent.start, parent.end)
                    width = Dimension.fillToConstraints
                }
                .background(Color.White)
                .padding(horizontal = 20.dp, vertical = 10.dp)
        ) {

            FilledButton(
                name = stringResource(id = R.string.continue_label), modifier = Modifier
                    .fillMaxWidth()
            )


        }

    }
}

@Composable
fun PersonalDetailsContent(
    modifier: Modifier = Modifier,
    currentStep: PersonalDetailsRoutes.Steps = PersonalDetailsRoutes.Steps.YourDetailsRoute
) {
    Column(modifier = modifier) {
        when (currentStep) {
            PersonalDetailsRoutes.Steps.YourDetailsRoute -> YourDetailsScreen()
            PersonalDetailsRoutes.Steps.VerifyPhoneNumberRoute -> OTPScreen()
            PersonalDetailsRoutes.Steps.SetPasswordRoute -> SetPasswordScreen()
        }
    }

}