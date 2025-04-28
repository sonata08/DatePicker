package com.testproject.presentation

import platform.UIKit.UIViewController

interface NativeViewFactory {
    fun createDatePickerView(
        onDateSelect: (Long) -> Unit,
        onDismiss: () -> Unit,
    ): UIViewController

    fun createProvideTextView(
        text: String,
        onDone: (String) -> Unit,
        onDismiss: () -> Unit,
    ): UIViewController
}