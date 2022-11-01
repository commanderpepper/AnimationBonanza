package com.commanderpepper.animationbonanza.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextFields(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            modifier = Modifier
                .border(
                    border = BorderStroke(
                        2.dp,
                        Brush.horizontalGradient(
                            colors = listOf(MaterialTheme.colors.primary, MaterialTheme.colors.secondary)
                        )
                    )
                )
                .padding(4.dp),
            color = MaterialTheme.colors.primary,
            text = "Gradient Outline",
            style = MaterialTheme.typography.subtitle2,
        )
    }
}

@Preview
@Composable
fun TextFieldsPreview() {
    TextFields()
}