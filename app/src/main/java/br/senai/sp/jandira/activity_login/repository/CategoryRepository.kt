package br.senai.sp.jandira.activity_login.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.activity_login.R
import br.senai.sp.jandira.activity_login.model.Category


class CategoryRepository {
    companion object{
        @Composable
        fun getCategories(): List<Category>{
            return listOf(
                Category(
                    id = 1,
                    name = "Montain",
                    icon = painterResource(id = R.drawable.montanha)
                ),
                Category(
                    id = 2,
                    name = "Beach",
                    icon = painterResource(id = R.drawable.beach)
                ),
                Category(
                    id = 3,
                    name = "Ski",
                    icon = painterResource(id = R.drawable.alpine)
                ),
                Category(
                    id = 4,
                    name = "Snow",
                    icon = painterResource(id = R.drawable.snowfall)
                )
            )
        }
    }


}