package com.example.androidautobuildapk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    var status by remember { mutableStateOf("Parado") }

    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Android Tasker Controller",
                    fontSize = 22.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(onClick = {
                    status = "Automação iniciada"
                }) {
                    Text("Iniciar Automação")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Status: $status",
                    fontSize = 16.sp
                )
            }
        }
    }
}
