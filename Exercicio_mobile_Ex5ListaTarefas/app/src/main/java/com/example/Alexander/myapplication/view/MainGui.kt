package com.example.Alexander.myapplication.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.unit.dp
import com.example.Alexander.myapplication.model.Tarefa
import com.example.Alexander.myapplication.view.Widgets.WidgetTarefa

@Composable
fun MainGui(){
    Box(){
        Text(modifier = Modifier.background(Blue).align(Alignment.BottomEnd), text = "+")
    }

    Column {
        var tarefa1 = Tarefa("Mobile", "20/09")
        WidgetTarefa(tarefa1)

        var tarefa2 = Tarefa("Php", "25/09")
        WidgetTarefa(tarefa2)

        var tarefa3 = Tarefa("SQL", "30/09")
        WidgetTarefa(tarefa3)
    }
}