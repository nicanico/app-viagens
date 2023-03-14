package br.senai.sp.jandira.activity_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.activity_login.ui.theme.ActivityloginTheme

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
                .height(300.dp))
            {
                Image(
                    painter = painterResource(id = R.drawable.paris),
                    contentDescription = ""
                )

                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Susanna Hoffs")

                Column(
                    modifier = Modifier.fillMaxWidth()
            )
                {
                    Row() {
                        Icon(
                            painter = painterResource(id = R.drawable.location),
                            contentDescription = "",
                        tint = Color.White
                        )
                        Text(
                            text = "You're in Paris",
                            color = Color.White)
                    }

                    Text(text = "My Trips")
                }

            }
                Column(
                    modifier = Modifier.fillMaxSize().padding(top = 210.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "sd,jkhvfdslkfhu")
                    Text(text = "sd,uadfhlkaushflkasufhfuhs")
                }
        }



    }


}