package br.senai.sp.jandira.activity_login.model

import androidx.compose.ui.graphics.painter.Painter

data class Category(
    var id: Long = 0,
    var name: String = " ",
    var icon: Painter? = null
)
