package br.senai.sp.jandira.activity_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.activity_login.ui.theme.ActivityloginTheme

class singUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityloginTheme {
                // A surface container using the 'background' color from the theme
                singUp()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun singUp() {
    var userNameState = rememberSaveable {
        mutableStateOf("")
    }

    var userPhoneState = rememberSaveable {
        mutableStateOf("")
    }

    var userEmailState = rememberSaveable {
        mutableStateOf("")
    }

    var passwordState = rememberSaveable {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Surface(
                    modifier = Modifier
                        .height(40.dp)
                        .width(120.dp),
                    color = Color(207, 6, 240),
                    shape = RoundedCornerShape(
                        bottomStart = 32.dp
                    )
                ) {
                }
            }


            // form
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally


            ) {
                Text(
                    text = stringResource(id = R.string.sing_up),
                    modifier = Modifier.padding(top = 13.dp),
                    fontSize = 32.sp,
                    color = Color(207, 6, 240),
                    fontWeight = FontWeight.W700,

                    )
                Text(
                    text = stringResource(id = R.string.sing_up_create),
                    modifier = Modifier.padding(bottom = 50.dp),
                    fontSize = 14.sp,
                    color = Color(160, 156, 156)
                )
                OutlinedTextField(
                    value = userNameState.value,
                    onValueChange = {
                        userNameState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 17.dp, end = 17.dp, bottom = 31.dp),
                    label = { Text(text = stringResource(id = R.string.username))},
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.user),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )
                    }
                )

                // sss
                OutlinedTextField(
                    value = userPhoneState.value,
                    onValueChange = {
                        userPhoneState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 17.dp, end = 17.dp, bottom = 31.dp),
                    label = { Text(text = stringResource(id = R.string.phone))},
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.phone),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )
                    }
                )
                OutlinedTextField(
                    value = userEmailState.value,
                    onValueChange = {
                        userEmailState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 17.dp, end = 17.dp, bottom = 31.dp),
                    label = { Text(text = stringResource(id = R.string.input_email))},
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
                    value = passwordState.value,
                    onValueChange = {
                        passwordState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 17.dp, end = 17.dp, bottom = 31.dp),
                    label = { Text(text = stringResource(id = R.string.input_password))},
                    visualTransformation = PasswordVisualTransformation(),
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.lock),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )
                    }
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Checkbox(
                        checked = false,
                        onCheckedChange = null,

                        )
                    Text(
                        text = stringResource(id = R.string.check_over),
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 31.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Button(

                        onClick = { /*TODO*/
                        },
                        modifier = Modifier
                            .padding(16.dp),
                        shape = RoundedCornerShape(
                            topStart = 16.dp,
                            topEnd = 16.dp,
                            bottomStart = 16.dp,
                            bottomEnd = 16.dp,
                            ),
                        colors = ButtonDefaults.buttonColors(Color(207, 6, 240))

                    ) {
                        Text(
                            text = stringResource(id = R.string.button_create),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 16.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = stringResource(id = R.string.have_account),
                        color = Color(160, 156, 156),
                        fontWeight = FontWeight.W400
                    )
                    Text(
                        text = stringResource(id = R.string.sing_in),
                        modifier = Modifier.padding(start = 4.dp),
                        color = Color(207, 6, 240),
                        fontWeight = FontWeight.W700
                    )
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
                Surface(
                    modifier = Modifier
                        .height(40.dp)
                        .width(120.dp),
                    color = Color(207, 6, 240),
                    shape = RoundedCornerShape(
                        topEnd = 32.dp
                    ),
                ) {
                }
            }


        }
    }
}