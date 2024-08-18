package com.example.profileapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileapp.R


@Preview(showBackground = true)
@Composable
fun ProfileItem() {
    var checked = remember { mutableStateOf(true) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {  },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier.size(48.dp),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile picture"
        )
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp),
        ) {
            Text(
                text = "Cleidson Souza Bononi",
                fontSize = 16.sp
            )
            Text(
                text = "30 anos",
                fontSize = 12.sp,
                fontStyle = FontStyle.Italic
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp) ,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Switch(
                modifier = Modifier.size(16.dp),
                checked = checked.value,
                onCheckedChange = { checked.value = it }
            )
            Text(
                modifier = Modifier.padding(vertical = 8.dp),
                text = "Ativo",
                fontSize = 8.sp,
            )
        }
    }
}