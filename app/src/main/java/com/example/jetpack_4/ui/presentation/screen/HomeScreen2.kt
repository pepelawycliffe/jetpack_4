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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_4.R
import com.example.jetpack_4.ui.theme.Jetpack_4Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen2(profilePicture: Painter,){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFFE9E3CB), // Lighter color
                    Color(0xFF5A7C76)  // Darker color
                )
            )
            )
    ) {
        // Yourcontent here
    }
    Scaffold(
        topBar = {
            MyTopAppBar(
                name= "Hello Julia",
                message = "Wellcome back",
                profilePicture =painterResource(id = R.drawable.profile_picture),
                onNotificationClick ={
//                    Handle notification
                }
            )

        }
        ,
        modifier =Modifier.fillMaxSize()
            .background(brush = Brush.verticalGradient(
                colors = listOf(Color(0xFFE9E3CB)
                    ,Color(0xFF5A7C76)))),
//        containerColor =Color(0xFFE9E3CB),
//        contentColor = Color(0xFF5A7C76),

 bottomBar = {
     BottomAppBar {
     Row(modifier = Modifier
         .fillMaxSize()
         .fillMaxWidth()) {
         Row(modifier = Modifier
             .fillMaxWidth(0.7f)
             .padding(10.dp)) {
             IconButton(onClick = { /* Handle icon click */ }) {
                 Icon(Icons.Filled.Home, contentDescription = "Home")
             }
             Spacer(modifier = Modifier.width(2.dp))
             IconButton(onClick = { /*TODO*/ }) {
                 Icon(Icons.Filled.Menu, contentDescription = "menu")
             }

         }
         Row (modifier = Modifier.fillMaxWidth(1f)){
             IconButton(onClick = { /*TODO*/ }) {
                 Icon(Icons.Filled.MailOutline, contentDescription = "message")
             }
             IconButton(onClick = { /*TODO*/ }) {
                 Icon(Icons.Filled.Person, contentDescription = "Person")
             }
         }
     }

     }
 }
    ) {

        paddingvalues ->

        Column(modifier = Modifier.padding(paddingvalues)) {

        }
//        search filled

//        ...........................................................

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFFE9E3CB), // Lighter color
                    Color(0xFF5A7C76)  // Darker color
                )
            )
            )
    ) {
        // Yourcontent here
    }




//        ...........................................................

//..............

//        search filled end
        Column (modifier=Modifier
//            .background(Color.Black)
            .fillMaxSize()
            , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center){
Column {

}
           ElevatedCard{
 Column(modifier = Modifier
     .size(200.dp)
     .padding(2.dp),
     verticalArrangement = Arrangement.Center
     , horizontalAlignment = Alignment.CenterHorizontally
 )
 {
     Column(modifier = Modifier.fillMaxSize(0.6f)) {
         Image(
             painter = profilePicture,
             contentDescription = "Profile picture",
             modifier = Modifier
//                 .size(40.dp)
//                 .clip(CircleShape)
                 .fillMaxSize()
         )

     }
     Column(modifier = Modifier) {
         Text(text = "Clear Glow")
     }
 }
            }

        }
    }

}



@Preview(showBackground = true)
@Composable
fun HomeScreen2Preview() {
    Jetpack_4Theme {
        HomeScreen2(profilePicture =painterResource(id = R.drawable.profile_picture))

    }
}

