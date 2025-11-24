package com.alnod.buybloom.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alnod.buybloom.R
import com.alnod.buybloom.navigation.ROUT_START
import com.alnod.buybloom.ui.theme.newblue


@Composable
fun HomeScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        //Circular image
        Image(
            painter = painterResource(id= R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            //contentScale = ContentScale.Crop
        )





        Text(
            text = "Choose your product",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = newblue,
            fontFamily = FontFamily.Default
        )


        Spacer(modifier = Modifier.height(20.dp))


        Text(text = "This is a marketplace platform specifically designed to connect African businesses with global buyers.",
            textAlign = TextAlign.Center,
            )

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = {navController.navigate(ROUT_START)},
            modifier = Modifier.height(50.dp)
                .fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(newblue)

        ) {
            Text(text = "Next")

        }



    }



}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}