package com.bhaswat.toolshare.lending

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LendingScreen() {
    var toolName by remember { mutableStateOf("") }
    var toolDescription by remember { mutableStateOf("") }
    var available by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = toolName,
            onValueChange = { toolName = it },
            label = { Text("Tool Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = toolDescription,
            onValueChange = { toolDescription = it },
            label = { Text("Tool Description") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Available")
            Spacer(modifier = Modifier.weight(1f))
            Switch(
                checked = available,
                onCheckedChange = { available = it }
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /* TODO: Handle tool listing */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("List Tool")
        }
    }
}
