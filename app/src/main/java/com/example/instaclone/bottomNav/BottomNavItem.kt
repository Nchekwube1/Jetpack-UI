package com.example.instaclone.bottomNav

import com.example.instaclone.R

sealed class BottomNavItem (var title:String, var icon:Int, var screen_route:String){

            object Home : BottomNavItem("Home", R.drawable.home,"home")
            object Market: BottomNavItem("Market",R.drawable.market,"my_network")
            object Wallet: BottomNavItem("Wallet",R.drawable.wallet,"add_post")
            object History: BottomNavItem("History",R.drawable.history,"notification")
            object Profile: BottomNavItem("Profile", R.drawable.user,"jobs")
}