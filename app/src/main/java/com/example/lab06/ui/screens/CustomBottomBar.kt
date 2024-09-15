package com.example.lab06.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun CustomBottomBar(navController: NavController) {
    BottomAppBar {
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { navController.navigate("buildScreen") }) {
            Icon(Icons.Filled.Build, contentDescription = "Construir")
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { navController.navigate("menuScreen") }) {
            Icon(Icons.Filled.Menu, contentDescription = "Menú")
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { navController.navigate("favoriteScreen") }) {
            Icon(Icons.Filled.Favorite, contentDescription = "Favoritos")
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { navController.navigate("deleteScreen") }) {
            Icon(Icons.Filled.Delete, contentDescription = "Eliminar")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
