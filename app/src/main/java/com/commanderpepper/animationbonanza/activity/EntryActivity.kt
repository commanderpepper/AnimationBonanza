package com.commanderpepper.animationbonanza.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.commanderpepper.animationbonanza.screens.EntryScreen
import com.commanderpepper.animationbonanza.screens.TextFields
import com.commanderpepper.animationbonanza.theme.AnimationBonanzaTheme
import com.commanderpepper.animationbonanza.util.Route


class EntryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AnimationBonanzaTheme {
                val navController = rememberNavController()
                val entryRoute = Route("entry")
                val textFieldsRoute = Route("textFields")

                NavHost(navController = navController, startDestination = entryRoute.route){
                    composable(entryRoute.route){
                        EntryScreen(textFieldOnClick = {
                            navController.navigate(route = textFieldsRoute.route)
                        })
                    }
                    composable(textFieldsRoute.route){
                        TextFields()
                    }
                }
            }
        }
    }
}

