package com.example.lab06.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.lab06.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(navController: NavController) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /* Acción para el ícono del menú */ }) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = "Menú")
            }
        },
        title = { Text(text = "Título de la Aplicación") },
        actions = {
            IconButton(onClick = { /* Acción para la búsqueda */ }) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = "Buscar"
                )
            }
            IconButton(onClick = { navController.navigate("userProfile") }) {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = "Perfil"
                )
            }
        }
    )
}
