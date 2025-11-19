package com.alnod.buybloom.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
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
import com.alnod.buybloom.R

@Composable
fun StartScreen(){
    //Main Layout
    Column(
        modifier = Modifier.fillMaxSize(),
        //horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {





        //Row


        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(start = 20.dp)
        ) {


            Image(
                painterResource(id = R.drawable.product),
                contentDescription = "product",
                modifier = Modifier.size(width = 200.dp, height = 300.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillHeight
            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                painterResource(id = R.drawable.product),
                contentDescription = "product",
                modifier = Modifier.size(width = 200.dp, height = 300.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillHeight
            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                    painterResource(id = R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(width = 200.dp, height = 300.dp).clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillHeight
            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                painterResource(id = R.drawable.product),
                contentDescription = "product",
                modifier = Modifier.size(width = 200.dp, height = 300.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillHeight
            )
        }
    //End of row

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "SHOP.DISCOVER.TREND",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Blue,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )


        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Discover trending products in minutes, so you're always stocked with profitable items that sell.",
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {},
            modifier = Modifier.height(50.dp)
                .fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)

        ) {
            Text(text = "Let's Get Started",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
                )

        }

    }



}


@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen()

}