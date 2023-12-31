package com.expertapps.bluebank.ui.screens.getstarted

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.expertapps.bluebank.R
import com.expertapps.bluebank.ui.components.FilledButton
import com.expertapps.bluebank.ui.theme.AppColors
import kotlin.math.log


@Preview(showSystemUi = true, showBackground = true, device = Devices.PHONE)
@Composable
fun GetStartedScreen(modifier: Modifier = Modifier , loginClick : () -> Unit = {}, startClick : () -> Unit = {}) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .then(modifier)
    ) {

        val (logo, signIn, paymentIcon, title, body, btn) = createRefs()

        Icon(painter = painterResource(id = R.drawable.get_started_logo),
            tint = Color.Unspecified,
            contentDescription = "Get Started Logo",
            modifier = Modifier.constrainAs(logo) {
                top.linkTo(parent.top, 10.dp)
                start.linkTo(parent.start, 10.dp)
            })


        Text(
            text = stringResource(id = R.string.sign_in), modifier = Modifier.constrainAs(signIn) {
                linkTo(logo.top, logo.bottom)
                end.linkTo(parent.end, 10.dp)
            }.clickable { loginClick.invoke() }, style = MaterialTheme.typography.bodyLarge, color = AppColors.Blue0055F9
        )


        Image(
            painter = painterResource(id = R.drawable.payment_icon),
            contentDescription = "Payment Icon",
            modifier = Modifier.constrainAs(paymentIcon) {
                linkTo(logo.bottom, title.top, 50.dp)
                linkTo(parent.start, parent.end, 20.dp, 20.dp)
                width = Dimension.fillToConstraints
                height = Dimension.percent(0.4F)
            },
            contentScale = ContentScale.FillBounds
        )

        Text(
            text = stringResource(id = R.string.get_started_title),
            modifier = Modifier.constrainAs(title) {
                top.linkTo(paymentIcon.bottom, 40.dp)
                linkTo(logo.start, signIn.end)
                width = Dimension.fillToConstraints
            },
            style = MaterialTheme.typography.headlineLarge,
            color = Color.Black
        )



        Text(
            text = stringResource(id = R.string.get_started_body),
            modifier = Modifier.constrainAs(body) {
                top.linkTo(title.bottom, 20.dp)
                linkTo(logo.start, signIn.end)
                width = Dimension.fillToConstraints
            },
            style = MaterialTheme.typography.bodyMedium,
            color = AppColors.Gray5E5E5E
        )


        FilledButton(name = stringResource(id = R.string.get_started),
            modifier = Modifier
                .padding(vertical = 15.dp)
                .constrainAs(btn) {
                    linkTo(body.bottom, parent.bottom, bias = 0.9f)
                    linkTo(logo.start, signIn.end)
                    width = Dimension.fillToConstraints
                } , onClick = startClick)

    }

}