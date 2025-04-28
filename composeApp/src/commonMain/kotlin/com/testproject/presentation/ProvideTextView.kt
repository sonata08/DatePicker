package com.testproject.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun ProvideTextView(
    text: String,
    onDone: (String) -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
)