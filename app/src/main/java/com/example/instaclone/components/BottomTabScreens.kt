package com.example.instaclone.components

import android.content.Context
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaclone.R
import com.example.instaclone.ui.theme.IconBg
import com.example.instaclone.ui.theme.PrimaryGreen
import com.example.instaclone.ui.theme.WhiteBg

val homeItemsList = listOf<homeItems>(
            homeItems(R.drawable.sofi, "SOFI", "SoFi"),
            homeItems(R.drawable.oando, "OANDO", "Oando Plc."),
            homeItems(R.drawable.glo, "GLO", "glo plc.")
)


@Composable
fun HomeScreen() {
            val configuration = LocalConfiguration.current

            val screenHeight = configuration.screenHeightDp.dp
            val screenWidth = configuration.screenWidthDp.dp
            Column(
                        modifier = Modifier
                                    .fillMaxSize()
//                                    .wrapContentSize(Alignment.Center)

            ) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    modifier = Modifier
                                                .fillMaxWidth()
                        ) {
                                    Column(
                                                modifier = Modifier
                                                            .weight(1f)
                                                            .padding(horizontal = 10.dp)

                                    ) {
                                                Text(
                                                            text = "Hello Francis",
                                                            fontWeight = FontWeight.Bold,
                                                            color = Color.Black,
                                                            textAlign = TextAlign.Start,
                                                            fontSize = 20.sp
                                                )
                                                Text(
                                                            text = "Welcome to jetpack",
                                                            color = Color.Black,
                                                            textAlign = TextAlign.Start,
                                                            fontSize = 16.sp
                                                )

                                    }
                                    Row() {
                                                Icon(
                                                            imageVector = Icons.Default.Search,
                                                            contentDescription = "Search icon",
                                                            modifier = Modifier
                                                                        .size(30.dp),
                                                            tint = Color.Black

                                                )
                                                Spacer(modifier = Modifier.width(10.dp))
                                                Icon(
                                                            imageVector = Icons.Outlined.Notifications,
                                                            contentDescription = "Notifications icon",
                                                            modifier = Modifier
                                                                        .size(30.dp),
                                                            tint = Color.Black
                                                )
                                                Spacer(modifier = Modifier.width(10.dp))

                                    }
                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Card(
                                    modifier = Modifier
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
                                                Text(
                                                            text = "Wallet balance (USD)",
                                                            color = MaterialTheme.colors.background,
                                                            textAlign = TextAlign.Start,
                                                            fontSize = 16.sp
                                                )
                                                Spacer(modifier = Modifier.height(5.dp))

                                                Row(
                                                            verticalAlignment = Alignment.CenterVertically
                                                ) {
                                                            Text(
                                                                        text = "$5,680",
                                                                        color = MaterialTheme.colors.background,
                                                                        textAlign = TextAlign.Start,
                                                                        fontSize = 16.sp
                                                            )
                                                            Spacer(modifier = Modifier.width(10.dp))

                                                            Icon(
                                                                        imageVector = Icons.Default.SwapHoriz,
                                                                        contentDescription = "Loop icon",

                                                                        modifier = Modifier
                                                                                    .size(30.dp)
                                                                                    .clip(CircleShape)
                                                                                    .background(color = MaterialTheme.colors.background)
                                                                                    .padding(5.dp),
                                                                        tint = PrimaryGreen,

                                                                        )

                                                }
                                                Spacer(modifier = Modifier.height(15.dp))
                                                Button(
                                                            onClick = { /*TODO*/ },
                                                            shape = RoundedCornerShape(8.dp)
                                                ) {
                                                            Row(
                                                                        verticalAlignment = Alignment.CenterVertically,
                                                                        modifier = Modifier.padding(
                                                                                    vertical = 3.dp
                                                                        )
                                                            ) {
                                                                        Text(
                                                                                    text = "Add Funds",
                                                                                    color = PrimaryGreen,
                                                                                    textAlign = TextAlign.Start,
                                                                                    fontSize = 16.sp
                                                                        )
                                                                        Spacer(
                                                                                    modifier = Modifier.width(
                                                                                                4.dp
                                                                                    )
                                                                        )

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

                        Spacer(modifier = Modifier.height(5.dp))
                        Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(horizontal = 10.dp)
                        ) {
                                    Text(
                                                text = "Watchlist", color = Color.Black,
                                                fontWeight = FontWeight.Bold,
                                    )
                                    TextButton(onClick = { /*TODO*/ }) {
                                                Text(text = "See All", color = PrimaryGreen)
                                    }
                        }

                        LazyRow(

                        ) {
                                    items(homeItemsList) { item ->
                                                Card(
                                                            modifier = Modifier
                                                                        .padding(10.dp)
                                                                        .width(165.dp),
                                                            shape = RoundedCornerShape(8.dp)

                                                ) {
                                                            Column(
                                                                        modifier = Modifier
                                                                                    .background(color = IconBg)
                                                                                    .padding(10.dp)
                                                            ) {

                                                                        Row(
                                                                                    verticalAlignment = Alignment.CenterVertically,
                                                                                    horizontalArrangement = Arrangement.SpaceBetween
                                                                        ) {
                                                                           Row() {
                                                                                       Row() {
                                                                                                   Image(
                                                                                                               painter = painterResource(
                                                                                                                           id = item.image,
                                                                                                               ),
                                                                                                               contentDescription = "Image icon",
                                                                                                               modifier = Modifier
                                                                                                                           .width(40.dp)
                                                                                                                           .height(40.dp)
                                                                                                                           .clip(CircleShape)

                                                                                                   )
                                                                                       }
                                                                                       Spacer(
                                                                                                   modifier = Modifier.width(
                                                                                                               5.dp
                                                                                                   )
                                                                                       )
                                                                                       Column(
//                                                                                                   modifier = Modifier.
//                                                                                                           weight(1f)

                                                                                       ) {
                                                                                                   Text(
                                                                                                               text = item.sName,
                                                                                                               fontWeight = FontWeight.Bold,
                                                                                                               fontSize = 15.sp,
                                                                                                               color = Color.Black

                                                                                                   )

                                                                                                   Text(
                                                                                                               text = item.lName,
                                                                                                               fontSize = 12.sp,
                                                                                                               color = Color.Black

                                                                                                   )
                                                                                       }
                                                                           }
                                                                                    Spacer(
                                                                                                modifier = Modifier.width(
                                                                                                            5.dp
                                                                                                )
                                                                                    )
                                                                                    Row(
                                                                                                modifier = Modifier.
                                                                                                        weight(1f)
//                                                                                                            .background(color= WhiteBg)
                                                                                                ,
                                                                                                horizontalArrangement = Arrangement.End,
//                                                                                                        width(40.dp)
                                                                                    ) {
                                                                                                Icon(
                                                                                                            imageVector = Icons.Default.ArrowDropUp,
                                                                                                            contentDescription = "Upward icon stock market",
                                                                                                            tint = PrimaryGreen

                                                                                                )
                                                                                    }
                                                                        }

                                                            }
                                                }
                                    }
                        }
            }


}

@Composable
fun MarketScreen() {
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
fun WalletScreen() {
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
fun ProfileScreen() {
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
fun HistoryScreen() {
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


data class homeItems(val image: Int, val sName: String, val lName: String)