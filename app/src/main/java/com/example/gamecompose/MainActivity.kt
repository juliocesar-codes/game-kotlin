package com.example.gamecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamecompose.ui.theme.GameComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GameOverScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ScreenGame(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
            , horizontalArrangement = Arrangement.SpaceBetween,

        ) {
            Row(
                modifier = modifier
            ) {
                Text(
                    modifier = Modifier, text = "SCORE: 0050", color = Color.White
                )
            }
            Row(
                modifier = modifier
            ) {
                Text(
                    modifier = Modifier, text = "LIVES:", color = Color.White
                )
                AndroidEnemy(
                    modifier = Modifier.size(20.dp),
                    color = Color.Yellow,
                )
                AndroidEnemy(
                    modifier = Modifier.size(20.dp),
                    color = Color.Yellow,
                )
                AndroidEnemy(
                    modifier = Modifier.size(20.dp),
                    color = Color.Yellow
                )
            }
        }

        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            AndroidEnemy(
                color = Color.Green
            )
            AndroidEnemy(
                color = Color.Red
            )
            AndroidEnemy(
                color = Color.Blue
            )
            AndroidEnemy(
                color = Color.Yellow
            )
            AndroidEnemy(
                color = Color.Green
            )
        }
        Column(
            modifier = modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Nave(
                color = Color.Yellow
            )
            Text(
                modifier = modifier
                    .background(Color.Gray)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = "PRESS START",
                color = Color.White,
                fontSize = 32.sp,
            )
        }

    }
}

@Composable
fun GameOverScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(Color.Black)
            .fillMaxSize()
    ){
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            AndroidEnemy(
                color = Color.Green
            )
            AndroidEnemy(
                color = Color.Red
            )
            AndroidEnemy(
                color = Color.Blue
            )
            AndroidEnemy(
                color = Color.Yellow
            )
            AndroidEnemy(
                color = Color.Green
            )
        }
    }
}

@Composable
fun AndroidEnemy(modifier: Modifier = Modifier, color: Color) {
    Image(
        contentDescription = "Icone de Android",
        painter = painterResource(R.drawable.outline_android_24),
        modifier = modifier
            .size(75.dp),
        colorFilter = ColorFilter.tint(color)
    )
}

@Composable
fun Nave(modifier: Modifier = Modifier, color: Color) {
    Image(
        contentDescription = "Icone de Android",
        painter = painterResource(R.drawable.outline_add_triangle_24),
        modifier = modifier
            .size(75.dp),
        colorFilter = ColorFilter.tint(color)
    )
}