package com.example.jetpack_4.ui.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_4.ui.theme.Jetpack_4Theme
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen1(){
    Scaffold(
        topBar = {CenterAlignedTopAppBar(
            title = {
                Text(text = "HomeScreen1")
            }
        )
        }
    ) {
            paddingvalue ->
        Column (modifier = Modifier
            .padding(paddingvalue))
            {
            Column (modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.2f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Choose your favourite\n" +
                        " category",
                    fontSize = 28.sp,
                    color = Color.Green,
//                    fontStyle = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "You can choose more than one")
                Column {
                    Text(text = "SELECT ALL")
                    Column {

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreen1Preview() {
    Jetpack_4Theme {
        HomeScreen1()
    }
}