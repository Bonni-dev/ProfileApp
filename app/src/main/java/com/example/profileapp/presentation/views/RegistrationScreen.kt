package com.example.profileapp.presentation.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable


@Composable
fun RegistrationScreen() {

    val home = rememberLazyListState()

    LazyColumn {
        items()
    }


}

