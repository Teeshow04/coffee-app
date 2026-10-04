package com.example.jetpackcompose.jetpackcompose

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent


@Preview(showBackground = false)
@Composable
private fun ModifiersExample(){
     Column(
         modifier = Modifier.fillMaxWidth()
             .background(color = Color.Red)
             .padding(all = 16.dp),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.spacedBy(50.dp)
     ){
         Row(
             modifier = Modifier.fillMaxWidth()
                 .background(color = Color.Cyan, shape = RoundedCornerShape(15.dp))
                 .padding(all = 8.dp), horizontalArrangement = Arrangement.SpaceAround
         ) {
             Text(text = "Apple", fontSize =  20.sp)
             Text(text = "Banana", fontSize =  20.sp)
             Text(text = "Grapes", fontSize =  20.sp)

         }
         Box(
             modifier = Modifier.height(200.dp)
                 .background(color = Color.Blue, shape = RoundedCornerShape(20.dp),)
                 .size(200.dp)
                 .clickable(onClick = {})
                 .border(width = 2.dp, color = Color.White, shape = RectangleShape),
             contentAlignment = Alignment.Center
         ){
            Text(text = "Center", fontSize = 20.sp, color = Color.White )
         }

         Row(
           modifier = Modifier.fillMaxSize()
               .background(color = Color.Magenta, shape = RoundedCornerShape(15.dp))
               .padding(all = 8.dp),
             horizontalArrangement = Arrangement.SpaceAround

         ) {
             Text(text = "One", fontSize =  20.sp)
             Text(text = "Two", fontSize =  20.sp)
             Text(text = "Three", fontSize =  20.sp)

         }
     }
}
