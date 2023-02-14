package com.learn_android.bvrcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learn_android.bvrcompose.ui.theme.BVRComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BVRComposeTheme {
                FooterBestViewsReviews()
            }
        }
    }
}

@Composable
fun FooterBestViewsReviews(modifier: Modifier = Modifier){
    val textColor = colorResource(id = R.color.white_50_per)
    Column(modifier.background(colorResource(id = R.color.top_app_bar_background))) {
        Row(modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            
        ) {
            Image(painter = painterResource(id = R.drawable.logo_shape), contentDescription =null )
            Image(painter = painterResource(id = R.drawable.best_views_reviews), contentDescription ="Best Views Reviews",modifier.padding(start = 6.dp) )
        }
        Divider(modifier
            .background(colorResource(id = R.color.white_50_per))
            .fillMaxWidth()
        )
        
        Text(stringResource(id = R.string.all_right_reserved), color = textColor )
        Text(stringResource(id = R.string.disclaimer), color = textColor)
    }
}


private val gridCollenctionDataTwo = listOf(
    R.drawable.patio_furniture_set to R.string.patio_furniture_set ,
    R.drawable.sun_glass to R.string.sun_glass ,
    R.drawable.sun_screen to R.string.sun_screen ,
    R.drawable.wallk_behind_lawn_movers to R.string.walk_behind_lawn_movers ,
    R.drawable.women_sandels to R.string.women_sandels ,
    R.drawable.campaign_hammocks to R.string.campaign_hammocks
)

@Composable
fun CategoryGridTwo(modifier: Modifier = Modifier){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2) ,
        modifier
            .padding(vertical = 8.dp, horizontal = 8.dp)
            .background(Color.White)
            .border(width = 2.dp,
                color = colorResource(id = R.color.commission_statement_background_color))
    

    ){
        items(gridCollenctionDataTwo,){
                item -> GridCollectionCardTwo(
            drawableRes = item.first, stringRes = item.second,
            )
        }
    }
}

@Composable
fun CardViewTheme(modifier: Modifier = Modifier){
    Box(
        modifier
            .background(
                brush = Brush
                    .verticalGradient(
                        colors = listOf(
                            colorResource(id = R.color.card_color_gradient_1),
                            colorResource(id = R.color.card_color_gradient_2)
                        )
                    )
            )
            .height(205.dp)
            .width(344.dp)
    ) {

    }
}


private val gridCollectionDataOne = listOf(
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
 R.drawable.ic_action_name to R.string.micro_wave,
)

@Composable
fun CategoryGridOne(modifier: Modifier = Modifier){
    
    LazyVerticalGrid(columns = GridCells.Fixed(4),
        modifier
            .padding(vertical = 8.dp, horizontal = 8.dp)
            .background(Color.White),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
        ){
        items(gridCollectionDataOne){
            item ->
            GridCollectionCard(
                drawableRes = item.first,
                stringRes = item.second
            )
                    
        }

    }
    
}

@Composable
fun GridCollectionCardTwo(
    @DrawableRes drawableRes: Int,
    @StringRes stringRes: Int,

    modifier: Modifier = Modifier
){
    Surface(
        modifier = modifier.border(width = 1.dp, color = colorResource(id = R.color.commission_statement_background_color))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(bottom = 48.dp, top = 19.dp)
        ) {
            Box {
                Image(painter = painterResource(id = drawableRes),
                    contentDescription = null,
                    modifier
                        .width(93.dp)
                        .height(88.dp)

                )
            }

            Text(
                stringResource(id = stringRes),
                style = MaterialTheme.typography.caption
            )

        }
    }

}


@Composable
fun GridCollectionCard(
    @DrawableRes drawableRes: Int,
    @StringRes stringRes: Int,
    modifier: Modifier = Modifier
) {
    Surface(

        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier) {
            Box(
                modifier = modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(
                        colorResource(id = R.color.commission_statement_background_color),

                        )
            ) {
                Image(painter = painterResource(id = drawableRes),
                    contentDescription = "Category Image",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize()
                    )
            }
            Text(
                stringResource(id = stringRes),
                style = MaterialTheme.typography.caption,
                modifier = Modifier.padding(horizontal = 8.dp),
                textAlign = TextAlign.Center,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@Composable
fun BvrTopAppBar(modifier: Modifier = Modifier){
        TopAppBar (
            backgroundColor = colorResource(id = R.color.top_app_bar_background),
            elevation = AppBarDefaults.TopAppBarElevation,
            modifier = modifier
                ){
                    Row(modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                    Image(painter = painterResource(id = R.drawable.logo_shape), contentDescription =null )
                    Image(painter = painterResource(id = R.drawable.best_views_reviews), contentDescription ="Best Views Reviews",modifier.padding(start = 6.dp) )
                    }
        }
}



@Composable
@Preview
fun BvrToppAppBarPreview(){
    BVRComposeTheme {
        BvrTopAppBar()
    }
}

@Composable
@Preview
fun CommissionStatement(modifier: Modifier = Modifier) {
    BVRComposeTheme {
        Surface(color = colorResource(id = R.color.commission_statement_background_color)) {
            Text(stringResource(id = R.string.commission_statement),
                modifier.padding(vertical = 8.dp, horizontal = 16.dp))
        }
    }
}

@Composable
@Preview
fun CategoryGridPreview(){
    BVRComposeTheme {
        CategoryGridOne()
    }
}

@Composable
@Preview
fun CardViewThemePreview(){
    BVRComposeTheme {
        CardViewTheme()
    }
}

@Composable
@Preview
fun CategoryGridTwoPreview(){
    BVRComposeTheme {
        CategoryGridTwo()
    }
}

@Composable
@Preview
fun FooterBestViewsReviewsPreviews(){
    BVRComposeTheme {
        FooterBestViewsReviews()
    }
}


