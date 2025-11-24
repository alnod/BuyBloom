package com.alnod.buybloom.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alnod.buybloom.R
import com.alnod.buybloom.navigation.ROUT_HOME
import com.alnod.buybloom.ui.theme.newblue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashScreen(navController: NavController){

    //Navigation

    val coroutineScope = rememberCoroutineScope()
    coroutineScope.launch {
        delay(2000)
        navController.navigate(ROUT_HOME)
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .background(newblue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painterResource(id = R.drawable.appicon),
            contentDescription = "product",
            modifier = Modifier.size(width = 200.dp, height = 200.dp)
        )


        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Shop Smart. Live Better",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)

    }

}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}