package com.testproject.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitViewController
import com.testproject.LocalNativeViewFactory

@Composable
actual fun ProvideTextView(
    text: String,
    onDone: (String) -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier
) {
    val factory = LocalNativeViewFactory.current
    UIKitViewController(
        modifier = modifier.fillMaxSize(),
        factory = {
            factory.createProvideTextView(
                text = text,
                onDone = onDone,
                onDismiss = onDismiss
            )
        }
    )
}