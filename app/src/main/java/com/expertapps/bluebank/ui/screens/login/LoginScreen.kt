package com.expertapps.bluebank.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.expertapps.bluebank.R
import com.expertapps.bluebank.ui.components.BorderButton
import com.expertapps.bluebank.ui.components.FilledButton
import com.expertapps.bluebank.ui.theme.AppColors

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true, device = Devices.PHONE)
@Composable
fun LoginScreen(modifier: Modifier = Modifier.background(Color.White) , registerClick : ()->Unit = {}) {
    var passwordVisible by remember {
        mutableStateOf(false)
    }
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier)
    ) {
        val (logo, loginTitle, customerId, customerIdValue, password, passwordValue, forgetPassword, signIn, createAccount) = createRefs()
        Image(
            painter = painterResource(id = R.drawable.get_started_logo),
            contentDescription = "Login Icon",
            modifier = Modifier.constrainAs(logo) {
                top.linkTo(parent.top, 90.dp)
                linkTo(parent.start, parent.end)
            })
        Text(text = stringResource(id = R.string.sign_in),
            color = Color.Black,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.constrainAs(loginTitle) {
                top.linkTo(logo.bottom, 60.dp)
                start.linkTo(parent.start, 20.dp)
            })

        Text(text = stringResource(id = R.string.customer_id),
            color = AppColors.Gray3D3D3D,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.constrainAs(customerId) {
                top.linkTo(loginTitle.bottom, 30.dp)
                start.linkTo(loginTitle.start)
            })
        OutlinedTextField(value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(customerIdValue) {
                    top.linkTo(customerId.bottom, 10.dp)
                    linkTo(customerId.start, parent.end, endMargin = 20.dp)
                    width = Dimension.fillToConstraints
                }
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium, shape = RoundedCornerShape(4.dp))

        Text(text = stringResource(id = R.string.password),
            color = AppColors.Gray3D3D3D,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.constrainAs(password) {
                top.linkTo(customerIdValue.bottom, 20.dp)
                start.linkTo(loginTitle.start)
            })
        OutlinedTextField(value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(passwordValue) {
                    top.linkTo(password.bottom, 10.dp)
                    linkTo(password.start, parent.end, endMargin = 20.dp)
                    width = Dimension.fillToConstraints
                }
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium, shape = RoundedCornerShape(4.dp),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                // Localized description for accessibility services
                val description = if (passwordVisible) "Hide password" else "Show password"

                val imageIcon = if (passwordVisible)
                    Icon(
                        painter = painterResource(id = R.drawable.password_eye_on),
                        contentDescription = description
                    )
                else Icon(
                    painter = painterResource(id = R.drawable.password_eye_off),
                    contentDescription = description
                )

                // Toggle button to hide or display password
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    imageIcon
                }
            }
        )

        TextButton(modifier = Modifier.constrainAs(forgetPassword) {
            top.linkTo(passwordValue.bottom, 10.dp)
            end.linkTo(passwordValue.end)
        }, onClick = { /*TODO*/ }) {
            Text(
                text = stringResource(id = R.string.forget_password),
                style = MaterialTheme.typography.titleMedium,
                color = AppColors.Blue0055F9,
            )
        }

        FilledButton(name = stringResource(id = R.string.sign_in), modifier = Modifier
            .padding(vertical = 15.dp)
            .constrainAs(signIn) {
                top.linkTo(forgetPassword.bottom, 10.dp)
                linkTo(passwordValue.start, passwordValue.end)
                width = Dimension.fillToConstraints
            })


        BorderButton(name = stringResource(id = R.string.create_account), modifier = Modifier

            .constrainAs(createAccount) {
                linkTo(signIn.bottom, parent.bottom, bias = 0.8F)
                linkTo(passwordValue.start, passwordValue.end)
                width = Dimension.fillToConstraints
            })

    }

}