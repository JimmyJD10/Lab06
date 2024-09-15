package com.example.lab06.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomContent(padding: PaddingValues, clickCount: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Contenido de la Aplicación")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Número de clics: $clickCount", style = MaterialTheme.typography.bodyLarge)
    }
}
