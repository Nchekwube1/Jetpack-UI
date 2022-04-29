package com.example.instaclone.bottomNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem (var title:String, var icon:ImageVector, var screen_route:String){

            object Home : BottomNavItem("Home", icon = Icons.Rounded.Home,"Home")
            object Market: BottomNavItem("Market",icon = Icons.Rounded.Store,"Market")
            object Wallet: BottomNavItem("Wallet",icon = Icons.Rounded.CreditCard,"Wallet")
            object History: BottomNavItem("History",icon = Icons.Rounded.History,"History")
            object Profile: BottomNavItem("Profile", icon = Icons.Rounded.Person,"Profile")
}