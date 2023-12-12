package com.expertapps.bluebank.ui.screens.verifyindentity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.expertapps.bluebank.R
import com.expertapps.bluebank.ui.components.FilledButton
import com.expertapps.bluebank.ui.theme.AppColors

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SuccessScreen(title: String = "", body: String = "") {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (icon, title, body, button) = createRefs()
        val guideline = createGuidelineFromTop(0.3f)
        Image(
            painter = painterResource(id = R.drawable.success_bg),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds,
            contentDescription = "background"
        )

        Image(
            painter = painterResource(id = R.drawable.success_icon),
            modifier = Modifier.constrainAs(icon) {
                top.linkTo(guideline)
                linkTo(parent.start, parent.end)
            },
            contentScale = ContentScale.FillBounds,
            contentDescription = "background"
        )

        Text(
            text = stringResource(id = R.string.your_account_is_open),
            color = Color.Black,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.constrainAs(title) {
                top.linkTo(icon.bottom, 40.dp)
                linkTo(parent.start, parent.end)
            }, fontWeight = FontWeight.Black, fontSize = 20.sp
        )

        Text(
            text = stringResource(id = R.string.you_will_recieve_your_debit),
            color = AppColors.Gray5E5E5E,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.constrainAs(body) {
                top.linkTo(title.bottom, 10.dp)
                linkTo(parent.start, parent.end)
            }, fontWeight = FontWeight.Normal, textAlign = TextAlign.Center,
            fontSize = 14.sp
        )

        FilledButton(name = stringResource(id = R.string.done), modifier = Modifier
            .padding(vertical = 15.dp)
            .constrainAs(button) {
                bottom.linkTo(parent.bottom, 10.dp)
                linkTo(parent.start, parent.end, 10.dp, 10.dp)
                width = Dimension.fillToConstraints
            })
    }
}