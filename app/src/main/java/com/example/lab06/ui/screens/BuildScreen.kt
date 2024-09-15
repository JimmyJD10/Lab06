package com.example.lab06.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import com.example.lab06.R

@Composable
fun BuildScreen() {
    val buildIcon: Painter = painterResource(id = R.drawable.construcc)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = buildIcon,
            contentDescription = "Icono de Construcción",
            modifier = Modifier.size(120.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Pantalla de Construcción", style = MaterialTheme.typography.headlineLarge)
    }
}
