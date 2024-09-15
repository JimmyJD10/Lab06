package com.example.lab06

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab06.ui.screens.BuildScreen
import com.example.lab06.ui.screens.DeleteScreen
import com.example.lab06.ui.screens.FavoriteScreen
import com.example.lab06.ui.screens.MenuScreen
import com.example.lab06.ui.screens.HomeScreen
import com.example.lab06.ui.screens.UserProfileScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    Surface(color = MaterialTheme.colorScheme.background) {
        NavHost(navController = navController, startDestination = "home") {
            composable("home") { HomeScreen(navController) }
            composable("userProfile") { UserProfileScreen() }
            composable("buildScreen") { BuildScreen() }
            composable("menuScreen") { MenuScreen() }
            composable("favoriteScreen") { FavoriteScreen() }
            composable("deleteScreen") { DeleteScreen() }
        }
    }
}
