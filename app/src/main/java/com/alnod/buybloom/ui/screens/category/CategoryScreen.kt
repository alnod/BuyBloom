package com.alnod.buybloom.ui.screens.category

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alnod.buybloom.R
import com.alnod.buybloom.navigation.ROUT_PRODUCTS
import com.alnod.buybloom.ui.screens.about.AboutScreen
import com.alnod.buybloom.ui.theme.newblue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()

    ) {

        //TopAppBAr
        TopAppBar(
            title = { Text(text = "Product Categories") },
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
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Menu Icon",)
                }

                IconButton(onClick = { navController.navigate(ROUT_PRODUCTS)}) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "Menu Icon",)
                }

            }
        )
    //End OF TopAppBar


        Image(painter = painterResource(id = R.drawable.products),
            contentDescription = "product",
            modifier = Modifier.height(250.dp).fillMaxSize(),
            contentScale = ContentScale.FillHeight

            )


        Spacer(modifier = Modifier.height(10.dp))


        //Search Bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "search icon")},
            label = {Text(text = "Search Products...")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                focusedLeadingIconColor = newblue,
                focusedLabelColor = newblue


            )
        ) //End Of Search Bar


        Spacer(modifier = Modifier.height(10.dp))



        //Scrollable Column
        Column(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                .verticalScroll(rememberScrollState())

        ) {
            //Row
            Row() {
                Image(painter = painterResource(id = R.drawable.animalprintshoes),
                    contentDescription = "product",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop

                )

                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Text(text = "ANIMAL PRINT LEATHER BOAT SHOES", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Unisex", fontSize = 20.sp )
                    Text(text = "$ 400.00", fontSize = 15.sp)
                    Row{
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                    }
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(newblue)

                    ) {
                        Text(text = "Add To Cart")

                    }
                }

            }


            //End of Row


            Spacer(modifier = Modifier.height(10.dp))



            //Row
            Row() {
                Image(painter = painterResource(id = R.drawable.quarterzipjumper),
                    contentDescription = "product",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop

                )

                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Text(text = "QUARTER ZIP JUMPER", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Men", fontSize = 20.sp )
                    Text(text = "$ 71.00", fontSize = 15.sp)
                    Row{
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                    }
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(newblue)

                    ) {
                        Text(text = "Add To Cart")

                    }
                }

            }


            //End of Row

            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row() {
                Image(painter = painterResource(id = R.drawable.sunglasses),
                    contentDescription = "product",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop

                )

                Spacer(modifier = Modifier.width(10.dp))


                Column {
                    Text(text = "RECTANGULAR LIMITED EDITION SUNGLASSES", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Men", fontSize = 20.sp )
                    Text(text = "$ 65.00", fontSize = 15.sp)
                    Row{
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "shoe", tint = newblue)
                    }
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(newblue)

                    ) {
                        Text(text = "Add To Cart")

                    }
                }

            }


            //End of Row

        }




        //End of Scrollable column








    }

}


@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview(){
    CategoryScreen(rememberNavController())
}