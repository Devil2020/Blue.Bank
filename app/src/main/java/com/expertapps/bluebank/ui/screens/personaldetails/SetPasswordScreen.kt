package com.expertapps.bluebank.ui.screens.personaldetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Dimension
import com.expertapps.bluebank.R
import com.expertapps.bluebank.ui.theme.AppColors

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SetPasswordScreen() {
    var passwordVisible by remember {
        mutableStateOf(false)
    }
    Column {
        Text(
            text = stringResource(id = R.string.set_a_password),
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
        )

        Text(
            text = stringResource(id = R.string.you_will_need_it_to_login),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Normal,
            color = AppColors.Gray5E5E5E,
            modifier = Modifier.padding(top = 9.dp, start = 10.dp)
        )

        Text(
            text = stringResource(id = R.string.password),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Gray3D3D3D,
            modifier = Modifier.padding(top = 30.dp, start = 10.dp)
        )

        OutlinedTextField(value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, top = 20.dp)
                .fillMaxWidth()
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
        Text(
            text = stringResource(id = R.string.password_strength_is),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 20.dp , bottom = 10.dp, start = 10.dp)
        )
        PasswordStrengthItem(
            isPassed = true,
            message = stringResource(id = R.string.must_be_at_least_8)
        )
        PasswordStrengthItem(
            isPassed = true,
            message = stringResource(id = R.string.can_not_include_your_name_or_email)
        )
        PasswordStrengthItem(
            isPassed = false,
            message = stringResource(id = R.string.must_have_at_least_one_symbol_or_number)
        )
        PasswordStrengthItem(
            isPassed = true,
            message = stringResource(id = R.string.can_not_contain_space)
        )
    }
}

@Composable
fun PasswordStrengthItem(isPassed: Boolean, message: String) {
    Row(modifier = Modifier.padding(vertical = 5.dp , horizontal = 10.dp) , verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = if (isPassed) R.drawable.passed else R.drawable.not_passed),
            contentDescription = "Password Strength Item Status"
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = message,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Medium,
            color = if (isPassed) Color.Black else AppColors.RedE61E00,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 5.dp, start = 2.dp)
        )
    }
}