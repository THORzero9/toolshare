package com.bhaswat.toolshare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.bhaswat.toolshare.core.AppNavigation
import com.bhaswat.toolshare.ui.theme.ToolshareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToolshareTheme {
                AppNavigation()
            }
        }
    }
}