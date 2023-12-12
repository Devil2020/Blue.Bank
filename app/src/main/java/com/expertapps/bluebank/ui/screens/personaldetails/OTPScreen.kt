package com.expertapps.bluebank.ui.screens.personaldetails

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.expertapps.bluebank.R
import com.expertapps.bluebank.ui.theme.AppColors

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnScope.OTPScreen(modifier: Modifier = Modifier) {

    Text(
        text = stringResource(id = R.string.enter_four_digits),
        style = MaterialTheme.typography.bodyLarge,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Black,
        modifier = Modifier.padding(top = 10.dp, start = 10.dp)
    )

    Text(
        text = stringResource(id = R.string.you_number),
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.Normal,
        color = AppColors.Gray5E5E5E,
        modifier = Modifier.padding(top = 20.dp, start = 10.dp)
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 20.dp)
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .width(50.dp)
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium,
            shape = RoundedCornerShape(4.dp),
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(start = 10.dp)
                .width(50.dp)
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium,
            shape = RoundedCornerShape(4.dp),
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(start = 10.dp)
                .width(50.dp)
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium,
            shape = RoundedCornerShape(4.dp),
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(start = 10.dp)
                .width(50.dp)
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium,
            shape = RoundedCornerShape(4.dp),
        )
    }

    TextButton(
        modifier = Modifier.padding(top = 10.dp, start = 10.dp), onClick = { }) {
        Text(
            text = stringResource(id = R.string.send_code_again),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Blue0055F9,
        )
    }
}