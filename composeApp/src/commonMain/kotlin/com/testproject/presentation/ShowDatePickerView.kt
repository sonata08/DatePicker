package com.testproject.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun ShowDatePickerView(
    onDateSelect: (Long?) -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
)