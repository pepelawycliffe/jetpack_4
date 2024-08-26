package com.example.jetpack_4.ui.presentation.screen

import android.window.SplashScreenView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_4.ui.theme.Jetpack_4Theme

@Composable
fun  SplashScreenView(){
// this is a gradient color
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFE9E3CB), // Lighter color
                        Color(0xFF5A7C76)  // Darker color
                    )
                )
            )
    ) {
//        end of the gradient color
        // Yourcontent here
        Column (modifier = Modifier
            .fillMaxSize()){
            Column(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom

            ) {
                Button(onClick = { /*TODO*/},
                    modifier = Modifier
                    .size(300.dp,60.dp),
                    colors = ButtonDefaults.buttonColors(
                         contentColorFor(backgroundColor = Color.Yellow)
                    ),
                    border = BorderStroke(3.dp ,
                    color = Color.White)
//           colors = ButtonColors(0xFF5A7C76)
//           Color of the button should be 0xFF5A7C76
                ) {
                    Text(text = "Let's Shop ->", fontSize = 21.sp, )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack_4Theme {
        SplashScreenView()
    }
}