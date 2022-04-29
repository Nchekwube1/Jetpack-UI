package com.example.instaclone.bottomNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.instaclone.R

sealed class BottomNavItem (var title:String, var icon:ImageVector, var screen_route:String){

            object Home : BottomNavItem("Home", icon = Icons.Default.Home,"Home")
            object Market: BottomNavItem("Market",icon = Icons.Default.Store,"Market")
            object Wallet: BottomNavItem("Wallet",icon = Icons.Filled.CreditCard,"Wallet")
            object History: BottomNavItem("History",icon = Icons.Default.History,"History")
            object Profile: BottomNavItem("Profile", icon = Icons.Default.Person,"Profile")
}