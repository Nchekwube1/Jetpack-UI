package com.example.instaclone.bottomNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.instaclone.ui.theme.Gray
import com.example.instaclone.ui.theme.PrimaryGreen
import com.example.instaclone.ui.theme.WhiteBg

@Composable
fun MainBottomTab(){
            val navController = rememberNavController( )
            Scaffold(bottomBar = {
                                    BottomBar(navController = navController)

            }) {
BottomNavGraph(navController = navController)
            }
}

@Composable
fun BottomBar(navController:NavHostController){
            val screens = listOf(
                        BottomNavItem.Home,
                        BottomNavItem.Market,
                        BottomNavItem.Wallet,
                        BottomNavItem.History,
                        BottomNavItem.Profile,
            )
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

                        BottomNavigation (
                                ){
                                                screens.forEach { screen ->
                                                            AddItem(
                                                                        screen,
                                                                        currentDestination = currentDestination,
                                                                        navController = navController
                                                            )

                                                }
                        }
}

@Composable
fun RowScope.AddItem(
            screen: BottomNavItem,
            currentDestination : NavDestination?,
            navController:NavHostController
){
  BottomNavigationItem(
              label = {
                          Text(text = screen.title,fontSize = 14.sp,
                                      )
              },
              icon = {
//                          Icon( ImageVector = screen.icon ,contentDescription ="Navigation icon for ${screen.title}" )
//                          Image(painter = painterResource(id = screen.icon), contentDescription = )
                     Icon(imageVector = screen.icon, contentDescription ="Navigation icon for ${screen.title}")
              },
              selected = currentDestination?.hierarchy?.any{
                          it.route == screen.screen_route
              } == true ,
              onClick = {
                          navController.navigate(screen.screen_route)
              },
              selectedContentColor= PrimaryGreen,
              unselectedContentColor = Gray,

  )
}