package com.commanderpepper.animationbonanza.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val primary = Color(0xFF29b6f6)
val primaryLight = Color(0xFF73e8ff)
val primaryDark = Color(0xFF0086c3)
val secondary = Color(0xFFffb74d)
val secondaryLight = Color(0xFFffe97d)
val secondaryDark = Color(0xFFc88719)

private val DarkColorPalette = darkColors(
    primary = primaryDark,
    primaryVariant = primary,
    secondary = secondaryDark,
    secondaryVariant = secondary
)

private val LightColorPalette = lightColors(
    primary = primaryLight,
    primaryVariant = primary,
    secondary = secondaryLight,
    secondaryVariant = secondary
)

@Composable
fun AnimationBonanzaTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if(darkTheme){
        DarkColorPalette
    }
    else {
        LightColorPalette
    }

    MaterialTheme(colors = colors, content = content)
}