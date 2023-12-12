package com.expertapps.bluebank.ui.screens.personaldetails

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.Dimension
import com.expertapps.bluebank.R
import com.expertapps.bluebank.ui.theme.AppColors
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ColumnScope.YourDetailsScreen(modifier: Modifier = Modifier) {

        Text(
            text = stringResource(id = R.string.your_details),
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
        )

        Text(
            text = stringResource(id = R.string.let_s_start_with_your_details),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Normal,
            color = AppColors.Gray5E5E5E,
            modifier = Modifier.padding(top = 9.dp, start = 10.dp)
        )

        Text(
            text = stringResource(id = R.string.title),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Gray3D3D3D,
            modifier = Modifier.padding(top = 20.dp, start = 10.dp)
        )

        ExposedDropdownMenuBox(modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .fillMaxWidth(), expanded = false, onExpandedChange = {}) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
                textStyle = MaterialTheme.typography.bodyMedium,
                shape = RoundedCornerShape(4.dp),
                readOnly = true,
                placeholder = {
                    Text(
                        text = stringResource(id = R.string.please_select),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Normal,
                        color = AppColors.Gray646464,
                    )
                },
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.collapsed),
                        contentDescription = ""
                    )
                }
            )

            ExposedDropdownMenu(
                expanded = false,
                onDismissRequest = { },
            ) {
                (1..1000).map { it.toString() }.forEach { selectionOption ->
                    DropdownMenuItem(
                        text = { Text(selectionOption) },
                        onClick = {

                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                    )
                }
            }
        }

        Text(
            text = stringResource(id = R.string.first_name),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Gray3D3D3D,
            modifier = Modifier.padding(top = 20.dp, start = 10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .fillMaxWidth()
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium,
            shape = RoundedCornerShape(4.dp),
        )

        Text(
            text = stringResource(id = R.string.to_help_us_for_verifing),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Normal,
            color = AppColors.Gray5E5E5E,
            modifier = Modifier.padding(top = (2.5).dp, start = 10.dp, end = 10.dp)
        )

        Text(
            text = stringResource(id = R.string.middle_name),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Gray3D3D3D,
            modifier = Modifier.padding(top = 20.dp, start = 10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .fillMaxWidth()
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium,
            shape = RoundedCornerShape(4.dp),
        )

        Text(
            text = stringResource(id = R.string.last_name),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Gray3D3D3D,
            modifier = Modifier.padding(top = 20.dp, start = 10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .fillMaxWidth()
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium,
            shape = RoundedCornerShape(4.dp),
        )

        Divider(
            thickness = 1.dp, modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 20.dp)
                .fillMaxWidth(), color = AppColors.GrayDFDFDF
        )

        Text(
            text = stringResource(id = R.string.email_address),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Gray3D3D3D,
            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .fillMaxWidth()
                .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
            textStyle = MaterialTheme.typography.bodyMedium,
            shape = RoundedCornerShape(4.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.enter_your_email_address),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Normal,
                    color = AppColors.Gray646464,
                )
            },
        )

        Text(
            text = stringResource(id = R.string.mobile_number),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Gray3D3D3D,
            modifier = Modifier.padding(top = 20.dp, start = 10.dp)
        )

        Row(
            modifier = Modifier
                .padding(top = 9.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .heightIn(TextFieldDefaults.MinHeight)
                    .border(
                        width = 1.dp,
                        shape = RoundedCornerShape(4.dp),
                        color = AppColors.GrayD1D1D1
                    )
                    .fillMaxWidth(0.235f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    painter = painterResource(id = R.drawable.america),
                    contentDescription = "america",
                    modifier = Modifier.size(35.dp, 15.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.collapsed),
                    contentDescription = "collapsed"
                )
            }

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxWidth(1f)
                    .border(1.dp, AppColors.GrayD1D1D1, RoundedCornerShape(4.dp)),
                textStyle = MaterialTheme.typography.bodyMedium,
                shape = RoundedCornerShape(4.dp),
            )
        }
}