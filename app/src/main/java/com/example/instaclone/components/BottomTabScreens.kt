package com.example.instaclone.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.ArrowRight
import androidx.compose.material.icons.rounded.ArrowRightAlt
import androidx.compose.material.icons.rounded.SubdirectoryArrowRight
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
import com.example.instaclone.ui.theme.PrimaryGreen

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
                                                  ,
                                                  tint = Color.Black
                                                  )
                                      Spacer(modifier = Modifier.width(10.dp))

                          }
        }
                        Spacer(modifier = Modifier.height(20.dp))

Card(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
//            .background(color = PrimaryGreen),
            elevation = 4.dp,
            shape = RoundedCornerShape(10.dp)

) {
            Column(
                        modifier = Modifier
//                                    .fillMaxWidth()
                                    .background(color = PrimaryGreen)
                                    .padding(20.dp)

//                                                .height(90.dp)

            ) {
                        Text(text = "Wallet balance (USD)",
                                    color = MaterialTheme.colors.background,
                                    textAlign = TextAlign.Start,
                                    fontSize = 16.sp
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Row(
                                    verticalAlignment = Alignment.CenterVertically
                        ) {
                                    Text(text ="$5,680" ,
                                                color =  MaterialTheme.colors.background,
                                                textAlign = TextAlign.Start,
                                                fontSize = 16.sp
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))

                                    Icon(imageVector = Icons.Default.SwapHoriz, contentDescription = "Loop icon",

                                                modifier = Modifier
                                                            .size(30.dp)
                                                            .clip(CircleShape)
                                                            .background(color =  MaterialTheme.colors.background)
                                                            .padding(5.dp)
                                                ,
                                                tint =  PrimaryGreen,

                                    )

                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Button(onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(8.dp)
                                    ) {
                                    Row(
                                                verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(vertical = 3.dp)
                                    ) {
                                                Text(text = "Add Funds",
                                                            color = PrimaryGreen,
                                                            textAlign = TextAlign.Start,
                                                            fontSize = 16.sp
                                                )
                                                Spacer(modifier = Modifier.width(4.dp))

                                                Icon(
                                                            imageVector = Icons.Rounded.ArrowRightAlt,
                                                            contentDescription = "Add funds Icon",
                                                            modifier = Modifier
                                                                        .size(30.dp),
                                                            tint = PrimaryGreen

                                                )
                                    }
                        }

            }
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