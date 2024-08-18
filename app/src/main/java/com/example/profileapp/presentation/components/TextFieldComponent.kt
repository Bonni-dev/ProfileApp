package com.example.profileapp.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profileapp.R
import com.example.profileapp.presentation.theme.BGColor
import com.example.profileapp.presentation.theme.GrayColor
import com.example.profileapp.presentation.theme.Primary

@Composable
fun TextFieldComponent(labelValue: String, iconResource: Int) {
    val textValue = remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        value = textValue.value,
        onValueChange = { textValue.value = it },
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = BGColor,
            focusedTextColor = Primary,
            focusedLabelColor = GrayColor,
            cursorColor = GrayColor,
        ),
        keyboardOptions = KeyboardOptions.Default,
        shape = RoundedCornerShape(16.dp),
        leadingIcon = {
            Icon(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = iconResource),
                contentDescription = "icon "
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldComponentPreview() {
    TextFieldComponent("Name", R.drawable.ic_launcher_foreground)
}