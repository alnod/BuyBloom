package com.alnod.buybloom.ui.screens.category

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alnod.buybloom.ui.screens.about.AboutScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(){

    Column(
        modifier = Modifier.fillMaxSize()

    ) {

        //TopAppBAr
        TopAppBar(
            title = {}
        )





        //End OF TopAppBar





    }

}


@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview(){
    CategoryScreen()
}