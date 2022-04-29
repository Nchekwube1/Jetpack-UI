package com.example.instaclone.bottomNav

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainBottomTab(){
            val navController = rememberNavController( )
            Scaffold(bottomBar = {
            }) {
BottomNavGraph(navController = navController)
            }
}