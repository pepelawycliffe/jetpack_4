package com.example.jetpack_4.ui.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_4.R
import com.example.jetpack_4.ui.theme.Jetpack_4Theme

@Composable
fun ProductScreen(profilePicture: Painter){

        // Yourcontent here
        Scaffold(
            topBar = {
            Column (modifier = Modifier.fillMaxWidth()){
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)){
                    Row (modifier = Modifier.fillMaxWidth(0.8f)){
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.ArrowBack, contentDescription = "menu")
                        }
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Row {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.Favorite, contentDescription = "menu")
                        }
                    }
                }
            }
        }) {
            paddingvalue ->
            Column (modifier= Modifier
                .padding(paddingvalue)){
            }
            Spacer(modifier = Modifier.height(10.dp))
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
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(2.dp, 70.dp),

                 ) {
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.4f)){
                    Column(modifier = Modifier.fillMaxSize()) {
                        Row(modifier = Modifier.fillMaxSize()) {
                            Row {
                                Text(text = "column 1")
                            }
                            Row {
                                Image(
                                    painter = profilePicture,
                                    contentDescription = "Profile picture",
                                    modifier = Modifier
//                 .size(40.dp)
//                 .clip(CircleShape)
                                        .fillMaxSize()
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Row (modifier = Modifier.padding(10.dp)){
                            Button(onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(20) // Example: Rounded corners

                            ) {
                                Text(text = "100 ML", fontSize =10.sp)
                            }
                            Button(onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(20)) {
                                Text(text = "250 ML",fontSize =10.sp)
                            }
                            Button(onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(20)) {
                                Text(text = "500 ML",fontSize =10.sp)
                            }
                            Button(onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(20)) {
                                Text(text = "1000 ML",fontSize =10.sp)
                            }
                        }
                    }
                }

            }
            }
        }

}


@Preview(showBackground = true)
@Composable
fun ProductScreenPreview() {
    Jetpack_4Theme {
        ProductScreen(profilePicture =painterResource(id = R.drawable.profile_picture))
    }
}

