package com.example.instaclone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColors(
            primary = PrimaryGreen,
            primaryVariant = Teal200,
            secondary = Teal200,
            background = DarkBg

)

private val LightColorPalette = lightColors(
            primary = PrimaryGreen,
            primaryVariant = Teal200,
            secondary = Teal200,
            background = WhiteBg

            /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun InstaCloneTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
            val colors = if (darkTheme) {
                        DarkColorPalette
            } else {
                        LightColorPalette
            }

            MaterialTheme(
                        colors = colors,
                        typography = Typography,
                        shapes = Shapes,
                        content = content
            )
}