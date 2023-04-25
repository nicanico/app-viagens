package br.senai.sp.jandira.activity_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.activity_login.model.Category
import br.senai.sp.jandira.activity_login.repository.CategoryRepository
import br.senai.sp.jandira.activity_login.ui.theme.ActivityloginTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityloginTheme {
                // A surface container using the 'background' color from the theme

                HomeScreen(CategoryRepository.getCategories())

            }
        }
    }
}

@Composable
fun HomeScreen(categories: List<Category>) {

    Scaffold( floatingActionButton = {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = Color(207, 6, 240)
        ) {
            Icon(imageVector = Icons.Default.Add,
                    contentDescription = " ",
                tint =  Color.White
            )
        }
    } ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Column() {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    backgroundColor = Color.Magenta,
                    shape = RectangleShape

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.paris),
                        contentDescription = "Logo com foto de paris",
                        contentScale = ContentScale.Crop
                    )
                }

                Text(
                    text = stringResource(id = R.string.category),
                    modifier = Modifier.padding(top = 14.dp, start = 14.dp),
                    color = Color.Gray
                )

                LazyRow() {
                    items(categories) {
                        Card(
                            modifier = Modifier
                                .size(200.dp, 80.dp)
                                .padding(4.dp),
                            backgroundColor = Color(207, 6, 240)
                        )
                        {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    // double bang - referente a arma de desenho com bang bang !!
                                    painter = it.icon!!,
                                    contentDescription = " ")
                                Text(text = it.name)
                            }

                        }
                    }

                }
            }
        }
    }


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview(){
    ActivityloginTheme {
        // A surface container using the 'background' color from the theme
        HomeScreen(CategoryRepository.getCategories())

    }
}
