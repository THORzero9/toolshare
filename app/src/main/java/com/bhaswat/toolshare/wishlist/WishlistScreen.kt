package com.bhaswat.toolshare.wishlist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.hilt.navigation.compose.hiltViewModel
import com.bhaswat.toolshare.community.ToolCard
import com.bhaswat.toolshare.data.models.Tool

@Composable
fun WishlistScreen(viewModel: WishlistViewModel = hiltViewModel()) {
    val tools = listOf(
        Tool("Drill", "A powerful drill.", "Peter Jones", "power-tools", "new", false, emptyList(), com.bhaswat.toolshare.data.models.Location(0.0, 0.0)),
        Tool("Wrench", "A versatile wrench.", "Mary Smith", "hand-tools", "fair", true, emptyList(), com.bhaswat.toolshare.data.models.Location(0.0, 0.0))

import com.bhaswat.toolshare.community.Tool
import com.bhaswat.toolshare.community.ToolCard

@Composable
fun WishlistScreen() {
    val tools = listOf(
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
