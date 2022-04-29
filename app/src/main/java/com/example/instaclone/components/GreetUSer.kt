package com.example.instaclone.components

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true, widthDp = 320)
@Composable
fun PreviewMessageCard() {
            MessageCard("Android")
}

@Composable
fun MessageCard(name: String) {
            var showBool by remember {
                        mutableStateOf(false)
            }
            val extraPadding by animateDpAsState(targetValue = if (showBool) 48.dp else 0.dp,
//                        animationSpec = spring(
//                                    dampingRatio = Spring.DampingRatioMediumBouncy,
//                                    stiffness = Spring.StiffnessLow
//                        )
                        )


            Surface(
                        color = MaterialTheme.colors.primary,
                        modifier = Modifier
                                    .fillMaxWidth()
            ) {
              Card( elevation = 4.dp,    modifier = Modifier
                          .fillMaxWidth()
                          .padding(25.dp)) {
                          Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier
                                      .padding(bottom = extraPadding)) {
                                      Text(text = "Hello $name!",
                                                  Modifier
                                                              .weight(1f)
                                                              ,
                                                  style =  MaterialTheme.typography.h4,
                                      )
                                      OutlinedButton(
                                                  onClick = {
                                                              showBool = !showBool
                                                  },
                                      ) {
                                                  Text(if (showBool) "Show less" else "Show more")
                                      }
                          }
              }

            }
}
