package br.senai.sp.jandira.activity_login.components

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TopShape() {
    Surface(
        modifier = Modifier
            .height(40.dp)
            .width(120.dp),
        shape = RoundedCornerShape(
            bottomStart = 32.dp
        ),
        color = Color(207, 6, 240),
    ) {
        // Box(modifier = Modifier.background(brush = Brush.horizontalGradient(listOf(Color.Cyan, Color.Black))))
    }
}

@Preview
@Composable
fun TopShapePreviw() {
    TopShape()
}

@Composable
fun BottomShape() {
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

@Preview
@Composable
fun BottomShapePreview() {
    BottomShape()
}