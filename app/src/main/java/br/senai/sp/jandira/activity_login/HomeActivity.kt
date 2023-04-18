package br.senai.sp.jandira.activity_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.activity_login.ui.theme.ActivityloginTheme
import java.time.format.TextStyle

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityloginTheme {
                // A surface container using the 'background' color from the theme
                Home()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Home() {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

            Box(
            modifier = Modifier
                .fillMaxSize()
                .height(300.dp),
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.paris),
                    contentDescription = ""
                )

                Column(
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                top = 13.dp,
                                end = 19.dp
                            ),
                        horizontalAlignment = Alignment.End
                    ) {
                        Card(
                            modifier = Modifier.size(61.dp),
                            shape = CircleShape,

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.susanna_hoffs),
                                contentDescription = "")
                        }
                        Text(
                            text = "Susanna Hoffs",
                            color = Color.White
                        )
                    }

                Column(
                    modifier = Modifier
                        .fillMaxSize()

                        .padding(start = 19.dp)

            )
                {
                    Row( modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 30.dp, top = 25.dp)
                    )
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.location),
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = "You're in Paris",
                            color = Color.White
                        )
                    }

                    Text(
                        text = "My Trips",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        color = Color.White
                    )

                }

            }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 210.dp, start = 19.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Categorias",
                        color = Color.Gray

                    )



                }
        }



    }


}