package com.example.compose_tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_tutorial.ui.theme.Compose_TutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hello world!")
        }
    }

}
    @Composable
        fun MessageCard(name: String){
            Text(text = "Hello $name!")
    }
    @Preview
    @Composable
        fun PreviewMessageCard(){
            MessageCard("Android" )

    }


