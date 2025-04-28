package com.testproject

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.testproject.presentation.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreen()
    }
}