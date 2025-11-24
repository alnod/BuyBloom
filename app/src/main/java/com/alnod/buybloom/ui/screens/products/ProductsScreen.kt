package com.alnod.buybloom.ui.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alnod.buybloom.R
import com.alnod.buybloom.ui.screens.category.CategoryScreen
import com.alnod.buybloom.ui.theme.newblue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsScreen(navController: NavController){


    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Other Categories") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newblue,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            ),

            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu Icon",)
                }
            },

            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Menu Icon",
                    )
                }

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "Menu Icon",)
                }

            }

        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome To Swaggy!",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 20.dp)
        )


        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Discover unique styles across categories. Find something for every vibe!",
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Shop By Category",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))



        Box {
            Image(painter = painterResource(id = R.drawable.quarterzip),
                contentDescription = "product",
                modifier = Modifier.size(width = 1000.dp, height = 220.dp).padding(start = 10.dp, end = 10.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                ,
                contentScale = ContentScale.FillWidth,
                )

            Text(text = "Quarter Zip",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.Center)
                )
            Icon(imageVector = Icons.Default.Favorite,
                contentDescription = "heart emoji",
                modifier = Modifier.padding(start = 20.dp),
                tint = Color.White)

        }

        Spacer(modifier = Modifier.height(10.dp))

        
        Box {
            Image(painter = painterResource(id = R.drawable.leatherloafers),
                contentDescription = "product",
                modifier = Modifier.size(width = 1000.dp, height = 220.dp).padding(start = 10.dp, end = 10.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                ,
                contentScale = ContentScale.FillWidth,
            )

            Text(text = "Shoes",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.Center)
            )
            Icon(imageVector = Icons.Default.Favorite,
                contentDescription = "heart emoji",
                modifier = Modifier.padding(start = 20.dp),
                tint = Color.White)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "More Categories Coming Soon",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally))


        Spacer(modifier = Modifier.height(25.dp))

        Button(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(newblue),
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)

        ) {
            Text(text = "Explore All Products")

        }

        Spacer(modifier = Modifier.height(15.dp))


        Text(text = "Follow us on Instagram @swaggy.ke",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Need help? Contact us at support@swaagy.co.ke",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "'Wear the vibe. Live the vibe.'",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold
        )

    }







    }

@Preview(showBackground = true)
@Composable
fun ProductsScreenPreview(){
    ProductsScreen(rememberNavController())
}

