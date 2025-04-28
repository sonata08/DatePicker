package com.testproject.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var showDatePicker by rememberSaveable { mutableStateOf(false) }
    var showProvideText by rememberSaveable { mutableStateOf(false) }
    var selectedDate by rememberSaveable { mutableStateOf("") }
    var providedText by rememberSaveable { mutableStateOf("") }

    if (showDatePicker) ShowDatePickerView(
        onDateSelect = {
            showDatePicker = false
            selectedDate = millisToDate(it)
        },
        onDismiss = { showDatePicker = false }
    )
    if (showProvideText) ProvideTextView(
        text = providedText,
        onDone = {
            showProvideText = false
            providedText = it
        },
        onDismiss = { showProvideText = false }
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = { Text("My Test App") })
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            item {
                Button(onClick = { showDatePicker = true }) {
                    Text("Select Date")
                }
                if (selectedDate.isNotEmpty()) {
                    Text("Selected date: $selectedDate")
                }
            }

            item {
                Button(onClick = { showProvideText = true }) {
                    Text("Provide Text")
                }
                Text(providedText)
            }
        }
    }
}