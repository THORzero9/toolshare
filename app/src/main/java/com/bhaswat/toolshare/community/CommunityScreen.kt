package com.bhaswat.toolshare.community

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CommunityScreen() {
    val tools = listOf(
        Tool("Hammer", "A sturdy hammer for all your needs.", "John Doe", true),
        Tool("Screwdriver", "A set of screwdrivers.", "Jane Doe", true),
        Tool("Drill", "A powerful drill.", "Peter Jones", false),
        Tool("Wrench", "A versatile wrench.", "Mary Smith", true)
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(tools) { tool ->
            ToolCard(tool)
        }
    }
}

@Composable
fun ToolCard(tool: Tool) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(tool.name, style = MaterialTheme.typography.headlineSmall)
            Text(tool.description, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text("Owner: ${tool.owner}", style = MaterialTheme.typography.bodySmall)
            Text(
                if (tool.available) "Available" else "Not Available",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
