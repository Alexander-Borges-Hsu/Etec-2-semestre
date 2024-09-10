package com.example.Alexander.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.Alexander.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.runtime.getValue;
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue;
import com.example.Alexander.myapplication.model.Tarefa
import com.example.Alexander.myapplication.view.MainGui
import com.example.Alexander.myapplication.view.Widgets.WidgetTarefa

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
               MainGui();

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        MainGui();
    }
}