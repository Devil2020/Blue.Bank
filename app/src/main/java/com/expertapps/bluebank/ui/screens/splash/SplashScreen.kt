package com.expertapps.bluebank.ui.screens.splash

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.expertapps.bluebank.R
import com.expertapps.bluebank.ui.theme.AppColors

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SplashScreen(
    modifier: Modifier = Modifier
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Blue0055F9)
            .then(modifier)
    ) {
        val (logo, name) = createRefs()
        Image(
            painter = painterResource(id = R.drawable.blue_bank_icon),
            contentDescription = "App Icon Logo",
            modifier = Modifier.constrainAs(logo) {
                linkTo(parent.start, parent.top, parent.end, parent.bottom)
            }
        )

        Text(
            text = stringResource(id = R.string.app_name),
            color = Color.White,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.constrainAs(name) {
                bottom.linkTo(parent.bottom, 10.dp)
                linkTo(parent.start, parent.end)
            })
    }
}