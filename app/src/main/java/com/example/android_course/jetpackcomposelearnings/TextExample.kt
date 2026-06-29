package com.example.android_course.jetpackcomposelearnings

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// @Preview (showBackground = true)
@Composable
fun TextExample() {
    Text(
        text = "Ribhu Mitra",
        color = Color.Blue,
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 2.sp,
        textAlign = TextAlign.Center
    )
}

// @Preview(showBackground = true, showSystemUi = false)
@Composable
fun TextFieldExample() {

    var name by remember { mutableStateOf("") }

    TextField(
        value = name,
        onValueChange = { name = it },
        label = {
            Text(
                text = "Enter Your Name"
            )
        },
        leadingIcon = {
            Text(
                text = "@ ",
                color = Color.Blue
            )
        },
        trailingIcon = {
            Text(
                text = "Submit",
                color = Color.Magenta
            )
        },
        singleLine = true,
        shape = CircleShape,
        colors = TextFieldDefaults.colors()
    )
}

@Preview (showBackground = true, showSystemUi = false)
@Composable
fun OutlinedTextFieldExample() {

    var name by remember { mutableStateOf("") }

    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        label = {Text(text = "Enter your name")},
        singleLine = true,
        shape = RoundedCornerShape(16.dp)

    )
}