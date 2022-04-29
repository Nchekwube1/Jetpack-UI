package com.example.instaclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.instaclone.bottomNav.MainBottomTab
import com.example.instaclone.ui.theme.InstaCloneTheme

class MainActivity : ComponentActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContent {
                                    InstaCloneTheme {
                                                Surface(
                                                            modifier = Modifier.fillMaxSize(),
//                                                            color = MaterialTheme.colors.background
                                                ) {
                                                            MainBottomTab()

                                                }
                                    }
                        }
            }
}

