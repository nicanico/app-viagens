package br.senai.sp.jandira.activity_login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.activity_login.components.BottomShape
import br.senai.sp.jandira.activity_login.components.TopShape
import br.senai.sp.jandira.activity_login.repository.UserRepository
import br.senai.sp.jandira.activity_login.ui.theme.ActivityloginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityloginTheme {
                // A surface container using the 'background' color from the theme
                Telalogin()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Telalogin() {

    val context = LocalContext.current

    var emailState by remember {
        mutableStateOf("")
    }

    var passwordState by remember {
        mutableStateOf("")
    }

    var passwordVisibilityState by remember {
        mutableStateOf(false)
    }



    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,

            ) {
            // header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End

            ) {
                TopShape()
            }
            // form
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(top = 100.dp),

                ) {
                Text(
                    text = stringResource(id = R.string.login),
                    modifier = Modifier.padding(start = 17.dp),
                    fontSize = 48.sp,
                    color = Color(207, 6, 240),
                    fontWeight = FontWeight.W700,

                    )
                Text(
                    text = stringResource(id = R.string.sign_in),
                    modifier = Modifier.padding(start = 17.dp, bottom = 87.dp),
                    fontSize = 14.sp,
                    color = Color(160, 156, 156)
                )
                OutlinedTextField(
                    value = emailState,
                    onValueChange = {
                        emailState = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 17.dp, end = 17.dp, bottom = 31.dp),
                    label = { Text(text = stringResource(id = R.string.input_email)) },
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.email),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )
                    }
                )
                OutlinedTextField(
                    value = passwordState,
                    onValueChange = {
                        passwordState = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 17.dp, end = 17.dp),
                    label = { Text(text = stringResource(id = R.string.input_password)) },
                    visualTransformation = if(!passwordVisibilityState) PasswordVisualTransformation() else VisualTransformation.None,
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.lock),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )

                    },
                    trailingIcon = {
                        IconButton(onClick = {
                            passwordVisibilityState = !passwordVisibilityState
                        }
                        ) {
                            Icon(
                                imageVector = if(passwordVisibilityState)
                                    Icons.Default.VisibilityOff
                                else
                                    Icons.Default.Visibility,
                                contentDescription = null
                            )
                        }
                    }
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 16.dp, bottom = 31.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Button(
                        onClick = {
                            authenticate(emailState, passwordState, context)
                        },
                        modifier = Modifier
                            .padding(top = 31.dp),
                        shape = RoundedCornerShape(
                            topStart = 16.dp,
                            topEnd = 16.dp,
                            bottomStart = 16.dp,
                            bottomEnd = 16.dp
                        ),
                        colors = ButtonDefaults.buttonColors(Color(207, 6, 240)),


                        ) {
                        Text(
                            text = stringResource(id = R.string.button_sign),
                            modifier = Modifier.padding(10.dp),
                            color = Color.White,
                            fontSize = 16.sp
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "",
                            tint = Color.White
                        )

                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 16.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(id = R.string.account),
                        color = Color(160, 156, 156),
                        fontWeight = FontWeight.W400
                    )
                    TextButton(onClick = {
                        var openSingUp = Intent(context, singUpActivity::class.java)
                        context.startActivity(openSingUp)
                    }) {
                        Text(
                            text = stringResource(id = R.string.sign_up),
                            modifier = Modifier.padding(start = 4.dp),
                            color = Color(207, 6, 240),
                            fontWeight = FontWeight.W700
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.width(48.dp))

            // form
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(17.dp)
            ) {

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {

                BottomShape()
            }


        }
    }
}

fun authenticate(email: String, password: String, context: Context) {

    val userRepository = UserRepository(context)
    val user = userRepository.authenticate(email, password)

    if (user != null){
        var openHome = Intent(context, HomeActivity::class.java)
        context.startActivity(openHome)
    }
}
