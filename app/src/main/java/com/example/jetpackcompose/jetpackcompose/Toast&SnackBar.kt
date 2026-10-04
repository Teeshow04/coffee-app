package com.example.jetpackcompose.jetpackcompose
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun ToastExample() {
  val context = LocalContext.current
 Column(
  modifier = Modifier
   .fillMaxSize()
   .padding(horizontal = 24.dp),
  horizontalAlignment = Alignment.CenterHorizontally,
  verticalArrangement = Arrangement.Center
 ) {
  Button(
   onClick = {
    Toast.makeText(context,
     "This is a Toast Message",
     Toast.LENGTH_SHORT).show()
   },
   modifier = Modifier.fillMaxWidth()
  ) {
   Text(text = "Show Toast")
   }
 }

 }



@Composable
fun SnackBarExample() {

 //SnackBarHostState controls snackbar
 var snackBarHostState = remember { SnackbarHostState() }

 //Coroutines Scope -> To Show SnackBar
 var scope = rememberCoroutineScope()


 Scaffold(
  snackbarHost = { SnackbarHost(hostState = snackBarHostState) }
 ) { innerPadding ->

  Column(
   modifier = Modifier
    .fillMaxSize()
    .padding(horizontal = 24.dp)
    .padding(innerPadding),
   horizontalAlignment = Alignment.CenterHorizontally,
   verticalArrangement = Arrangement.Center
  ) {

   Button(
    onClick = {
    scope.launch {
     snackBarHostState.showSnackbar(
      "This is a Snackbar Message",
      actionLabel = "UNDO",
      duration = SnackbarDuration.Short
     )
    }
    },
    modifier = Modifier.fillMaxWidth()
   ) {
    Text(text = "Show Snackbar Text Toast")
   }
  }
 }
}