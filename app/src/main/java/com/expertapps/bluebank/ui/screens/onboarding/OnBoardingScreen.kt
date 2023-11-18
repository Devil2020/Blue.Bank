package com.expertapps.bluebank.ui.screens.onboarding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.expertapps.bluebank.R
import com.expertapps.bluebank.app.navigation.routes.OnBoardingRoute
import com.expertapps.bluebank.app.navigation.routes.OnBoardingRoute.getSteps
import com.expertapps.bluebank.ui.components.FilledButton
import com.expertapps.bluebank.ui.screens.onboarding.models.Option
import com.expertapps.bluebank.ui.theme.AppColors

@Composable
fun StepItem(isSelected: Boolean) {
    Spacer(
        modifier = Modifier
            .width(40.dp)
            .height(4.dp)
            .background(
                color = if (isSelected) AppColors.Blue0055F9 else AppColors.GrayD9D9D9,
                shape = RoundedCornerShape(size = 20.dp)
            )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnBoardingActionBar(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
            .then(modifier)
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "Back",
                tint = Color.Black
            )
        }
        Spacer(modifier = Modifier.width(50.dp))
        StepItem(true)
        Spacer(modifier = Modifier.width(10.dp))
        StepItem(false)
        Spacer(modifier = Modifier.width(10.dp))
        StepItem(false)
        Spacer(modifier = Modifier.width(10.dp))
        StepItem(false)
        Spacer(modifier = Modifier.width(10.dp))
        StepItem(false)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier.background(Color.White), steps: ArrayList<OnBoardingRoute.Steps> = getSteps()) {

    var currentStep by remember {
        mutableStateOf(steps[2])
    }

    ConstraintLayout(modifier = Modifier.then(modifier)) {
        val (continueBtn, actionBar , content) = createRefs()

        OnBoardingActionBar(modifier = Modifier.constrainAs(actionBar) {
            top.linkTo(parent.top)
            linkTo(parent.start, parent.end)
            width = Dimension.fillToConstraints
        })

        OnBoardingContent(modifier = Modifier.constrainAs(content){
            linkTo(actionBar.bottom , continueBtn.top)
            linkTo(parent.start , parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        } , currentStep)

        FilledButton(
            name = stringResource(id = R.string.continue_label),
            modifier = Modifier.constrainAs(continueBtn) {
                bottom.linkTo(parent.bottom, 20.dp)
                linkTo(parent.start, parent.end, 10.dp, 10.dp)
                width = Dimension.fillToConstraints
            })
    }
}

@Composable
private fun OnBoardingContent(modifier: Modifier = Modifier, step: OnBoardingRoute.Steps) {
    Box(modifier = modifier) {
        when (step) {
           is OnBoardingRoute.Steps.ChooseBankAccountPage -> {SelectionPage(step.title , step.subTitle , step.question , step.options)}
           is OnBoardingRoute.Steps.ChooseAccountTypePage -> {SelectionPage(step.title , step.subTitle , step.question , step.options)}
           is OnBoardingRoute.Steps.ChooseAgePage -> {SelectionPage(step.title , step.subTitle , step.question , step.options)}
           is OnBoardingRoute.Steps.ChooseSavingTypesPage -> {SelectionPage(step.title , step.subTitle , step.question , step.options)}
           is OnBoardingRoute.Steps.RecommendationAccountsPage -> {RecommendationsPage(step.title , step.subTitle , step.question )}
        }
    }
}

@Composable fun SelectionPage ( title : String , subTitle : String , question : String , options : List<Option> ){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge ,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black ,
            modifier = Modifier.padding(top = 20.dp , start = 10.dp)
        )

        Text(
            text = subTitle,
            style = MaterialTheme.typography.titleMedium ,
            fontWeight = FontWeight.Normal,
            color = AppColors.Gray5E5E5E ,
            modifier = Modifier.padding(top = 9.dp , start = 10.dp)
        )

        Text(
            text = question,
            style = MaterialTheme.typography.titleMedium ,
            fontWeight = FontWeight.Bold,
            color = AppColors.Gray3D3D3D ,
            modifier = Modifier.padding(top = 20.dp , start = 10.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        options.forEach { option ->
            SelectionItem( option = option)
        }

    }
}

@Composable fun RecommendationsPage ( title : String , subTitle : String , question : String  ){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge ,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black ,
            modifier = Modifier.padding(top = 20.dp , start = 10.dp)
        )

        Text(
            text = subTitle,
            style = MaterialTheme.typography.titleMedium ,
            fontWeight = FontWeight.Normal,
            color = AppColors.Gray5E5E5E ,
            modifier = Modifier.padding(top = 9.dp , start = 10.dp)
        )

        Text(
            text = question,
            style = MaterialTheme.typography.titleMedium ,
            fontWeight = FontWeight.Bold,
            color = AppColors.Gray3D3D3D ,
            modifier = Modifier.padding(top = 20.dp , start = 10.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

    }
}

@Composable
fun SelectionItem (option : Option, selectedOption : Option?= null){
    Row(modifier = Modifier
        .padding(horizontal = 10.dp)
        .fillMaxWidth()
        .padding(vertical = 5.dp)
        .border(BorderStroke(1.dp, AppColors.GrayD1D1D1), shape = RoundedCornerShape(5.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column (modifier = Modifier
            .padding(horizontal = 20.dp)
            .padding(vertical = 15.dp)
            .weight(7F)) {
            Text(
                text = option.title,
                style = MaterialTheme.typography.titleMedium ,
                color= Color.Black,
                fontWeight = FontWeight.SemiBold ,
            )
            if(option.subTitle != null){
                Text(
                    text = option.subTitle,
                    style = MaterialTheme.typography.titleMedium ,
                    color= AppColors.Gray5E5E5E,
                    fontWeight = FontWeight.Normal ,
                )
            }
        }

        Icon(painter = painterResource(id = if(selectedOption == option) R.drawable.confirm else R.drawable.not_confirm) ,
            contentDescription = "Radio Button" ,
            tint = Color.Unspecified ,
            modifier = Modifier.weight(1F) )
    }
}
