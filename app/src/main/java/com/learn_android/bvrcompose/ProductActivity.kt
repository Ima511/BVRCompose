package com.learn_android.bvrcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.TopAppBar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import com.learn_android.bvrcompose.ui.theme.BVRComposeTheme

class ProductActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BVRComposeTheme {

            }
        }
    }
}

@Composable
fun CategoryTopAppBar(modifier: Modifier = Modifier){

    TopAppBar (

        backgroundColor = Color.White,
        elevation = AppBarDefaults.TopAppBarElevation,
        modifier = modifier,

    ){
        Row(modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {


        }
    }

}

@Composable
@Preview
fun FooterBestViewsReviewsPreviewsOne(){
    BVRComposeTheme {
        FooterBestViewsReviews()
    }
}

@Composable
@Preview
fun CategoryTopAppBarPreview(){
    BVRComposeTheme {
        CategoryTopAppBar()
    }
}