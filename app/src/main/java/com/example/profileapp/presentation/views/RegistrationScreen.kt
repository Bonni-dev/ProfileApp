package com.example.profileapp.presentation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profileapp.R
import com.example.profileapp.presentation.components.ButtonComponent
import com.example.profileapp.presentation.components.ProfilePhotoComponent
import com.example.profileapp.presentation.components.TextFieldComponent


@Composable
fun RegistrationScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            ProfilePhotoComponent()
            TextFieldComponent(
                labelValue = stringResource(id = R.string.label_name),
                iconResource = R.drawable.ic_launcher_foreground
            )
            TextFieldComponent(
                labelValue = stringResource(id = R.string.label_doc),
                iconResource = R.drawable.ic_launcher_foreground
            )
            TextFieldComponent(
                labelValue = stringResource(id = R.string.label_birth_date),
                iconResource = R.drawable.ic_launcher_foreground
            )
            TextFieldComponent(
                labelValue = stringResource(id = R.string.label_city),
                iconResource = R.drawable.ic_launcher_foreground
            )
            ButtonComponent()

        }

    }

}

@Preview
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen()
}

