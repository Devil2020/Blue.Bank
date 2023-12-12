package com.expertapps.bluebank.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.expertapps.bluebank.ui.theme.AppColors

@Composable
fun FilledButton (modifier : Modifier = Modifier , name : String , onClick : () ->Unit = {}){
    Button(onClick = onClick,
        shape = RoundedCornerShape(30.dp),
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = AppColors.Blue0055F9)
    ) {
        Text(text = name ,
            style = MaterialTheme.typography.bodyLarge ,
            modifier = Modifier.padding(vertical = 10.dp))
    }
}


@Composable
fun BorderButton (modifier : Modifier = Modifier , name : String, onClick : () ->Unit = {}){
    Button(onClick = onClick,
        shape = RoundedCornerShape(30.dp),
        modifier = Modifier
            .border(width = 1.dp, color = AppColors.Blue99BBFD, shape = RoundedCornerShape(size = 30.dp))
        .then(modifier),
        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
    ) {
        Text(text = name ,
            style = MaterialTheme.typography.bodyLarge ,
            modifier = Modifier.padding(vertical = 10.dp) ,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.Blue0055F9)
    }
}

