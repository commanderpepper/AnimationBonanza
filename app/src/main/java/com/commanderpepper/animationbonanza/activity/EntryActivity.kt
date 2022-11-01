package com.commanderpepper.animationbonanza.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.commanderpepper.animationbonanza.screens.EntryScreen
import com.commanderpepper.animationbonanza.theme.AnimationBonanzaTheme


class EntryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AnimationBonanzaTheme {
                EntryScreen(textFieldOnClick = {})
            }
        }
    }
}

