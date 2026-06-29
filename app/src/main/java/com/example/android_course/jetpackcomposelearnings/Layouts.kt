package com.example.android_course.jetpackcomposelearnings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowExample() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Apple",
            fontSize = 30.sp
        )
        Text(
            text = "Mango",
            fontSize = 30.sp
        )
        Text(
            text = "Banana",
            fontSize = 30.sp
        )
    }

}


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Apple",
            fontSize = 30.sp
        )
        Text(
            text = "Mango",
            fontSize = 30.sp
        )
        Text(
            text = "Banana",
            fontSize = 30.sp
        )
    }

}


// @Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnExample02() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Login")

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Username") }
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Password") }
        )
    }
}