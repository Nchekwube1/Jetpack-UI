package com.example.instaclone.bottomNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.instaclone.components.*

@Composable
fun BottomNavGraph(navController:NavHostController){
            NavHost(
                        navController = navController,
                        startDestination = BottomNavItem.Home.screen_route){
                        composable(route =BottomNavItem.Home.screen_route){
                                    HomeScreen()
                        }

                        composable(route =BottomNavItem.Wallet.screen_route){
                                    WalletScreen()
                        }

                        composable(route =BottomNavItem.Profile.screen_route){
                                    ProfileScreen()
                        }

                        composable(route =BottomNavItem.History.screen_route){
                                    HistoryScreen()
                        }

                        composable(route =BottomNavItem.Market.screen_route){
                                    MarketScreen()
                        }
            }

}