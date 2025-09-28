package com.example.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigation.ui.theme.NavigationTheme

@Composable
fun FriendsListScreen(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold {
        FriendsListScreenContent(
            modifier = modifier.padding(it),
            onNavigateBack = onNavigateBack,
        )
    }
}

@Composable
fun FriendsListScreenContent(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Friends List Screen")
        Button(
            onClick = onNavigateBack,
        ) {
            Text("Back to Profile")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FriendsListScreenPreview() {
    NavigationTheme {
        FriendsListScreenContent(
            onNavigateBack = {}
        )
    }
}