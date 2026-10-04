package com.example.jetpackcompose.jetpackcompose.scaffold

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyScreen() {
    Scaffold(
        topBar = { AppTopBar() },
        bottomBar = { AppBottomBar() },
        floatingActionButton = {FAB()}
    ) {innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
                .padding(vertical = 16.dp).verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()
            MyScreenContent()

        }

//        LazyColumn(
//            modifier = Modifier.fillMaxSize()
//                .padding(innerPadding)
//                .padding(vertical = 16.dp),
//            verticalArrangement = Arrangement.spacedBy(10.dp)
//        ) {
//            items(15){
//                MyScreenContent()
//
//            }
//        }
    }
}