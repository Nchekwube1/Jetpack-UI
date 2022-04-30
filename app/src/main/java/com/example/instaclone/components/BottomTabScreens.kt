package com.example.instaclone.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaclone.R

@Composable
fun HomeScreen(){
            Column(
                        modifier = Modifier
                                    .fillMaxSize()
//                                    .wrapContentSize(Alignment.Center)

            ) {
                        Spacer(modifier = Modifier.height(10.dp))
              Row(
                          verticalAlignment = Alignment.CenterVertically,
                         horizontalArrangement = Arrangement.SpaceBetween ,
                          modifier = Modifier
                                      .fillMaxWidth()
              ) {
        Column(modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp)

        ) {
                    Text(text = "Hello Francis",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                textAlign = TextAlign.Start,
                                fontSize = 20.sp
                                )
                    Text(text = "Welcome to jetpack",
                                color = Color.Black,
                                textAlign = TextAlign.Start,
                                fontSize = 16.sp
                                )

        }
                          Row() {
                                         Icon(imageVector = Icons.Default.Search, contentDescription = "Search icon",
                                                     modifier = Modifier
                                                                 .size(30.dp)
                                                     ,
                                                     tint = Color.Black

                                         )
                                      Spacer(modifier = Modifier.width(10.dp))
                                      Icon(imageVector = Icons.Outlined.Notifications, contentDescription ="Notifications icon",
                                                  modifier = Modifier
                                                              .size(30.dp)
//                                                              .padding(14.dp)
                                                  ,
                                                  tint = Color.Black
                                                  )
                                      Spacer(modifier = Modifier.width(10.dp))

                          }
        }

                        Column(
                                    modifier = Modifier
                                                .fillMaxWidth()
                                                .height(90.dp)

                        ) {

                        }
            }
}
@Composable
fun MarketScreen(){
            Column(
                        modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentSize(Alignment.Center)
            ) {
                        Text(
                                    text = "Market Screen",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    modifier = Modifier.align(Alignment.CenterHorizontally),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp
                        )
            }
}
@Composable
fun WalletScreen(){
            Column(
                        modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentSize(Alignment.Center)
            ) {
                        Text(
                                    text = "Wallet Screen",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    modifier = Modifier.align(Alignment.CenterHorizontally),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp
                        )
            }
}

@Composable
fun ProfileScreen(){
            Column(
                        modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentSize(Alignment.Center)
            ) {
                        Text(
                                    text = "Profile Screen",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    modifier = Modifier.align(Alignment.CenterHorizontally),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp
                        )
            }
}

@Composable
fun HistoryScreen(){
            Column(
                        modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentSize(Alignment.Center)
            ) {
                        Text(
                                    text = "History Screen",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    modifier = Modifier.align(Alignment.CenterHorizontally),
                                    textAlign = TextAlign.Center,
                                    fontSize = 20.sp
                        )
            }
}