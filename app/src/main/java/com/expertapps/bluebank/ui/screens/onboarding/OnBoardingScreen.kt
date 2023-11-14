package com.expertapps.bluebank.ui.screens.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.expertapps.bluebank.R
import com.expertapps.bluebank.app.navigation.routes.OnBoardingRoute
import com.expertapps.bluebank.ui.components.FilledButton
import com.expertapps.bluebank.ui.theme.AppColors

@Composable
fun StepItem (isSelected : Boolean){
    Spacer(modifier = Modifier
        .width(40.dp)
        .height(4.dp)
        .background(
            color = if (isSelected) AppColors.Blue0055F9 else AppColors.GrayD9D9D9,
            shape = RoundedCornerShape(size = 20.dp)
        ))
}

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun OnBoardingActionBar (modifier: Modifier = Modifier){
    Row ( verticalAlignment = Alignment.CenterVertically , modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp)
        .then(modifier)) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.back), contentDescription = "Back" , tint = Color.Black)
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

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier.background(Color.White)) {

    var currentStep by remember {
        mutableStateOf(OnBoardingRoute.Steps.ChooseBankAccountPage)
    }

    ConstraintLayout (modifier = Modifier.then(modifier)) {
        val (continueBtn, actionBar) = createRefs()

        OnBoardingActionBar(modifier = Modifier.constrainAs(actionBar){
            top.linkTo(parent.top)
            linkTo(parent.start , parent.end)
            width = Dimension.fillToConstraints
        })

        FilledButton(name = stringResource(id = R.string.continue_label), modifier = Modifier.constrainAs(continueBtn){
            bottom.linkTo(parent.bottom, 20.dp)
            linkTo(parent.start , parent.end , 10.dp,10.dp)
            width = Dimension.fillToConstraints
        })
    }
}

