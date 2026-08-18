package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp







@Composable
fun rowData(img: Int, data: String) {

    Card(modifier = Modifier.padding(10.dp)) {
        Row (verticalAlignment = Alignment.CenterVertically){

            Image(painter = painterResource(id = img), contentDescription = null
            , modifier = Modifier.size(64.dp).weight(.2f))
            Text(text = data, fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(10.dp).weight(.8f))
        }
    }
}

@Preview(showBackground = true)

@Composable
fun previewRowData() {
// https://youtu.be/ubjbGZlalGk?si=MYQeMXrw3FLseXaM
    LazyColumn(modifier = Modifier.fillMaxSize()){
        items(myLanguage()){ item ->
            rowData(img = item.image, data = item.text)
        }
    }

//  Column {
//        myLanguage().map{ item -> rowData(img = item.image, data = item.text)}
//    }
   // rowData(img = R.drawable.ic_launcher_foreground, data = "Jetpack Compose")
}

data class Language(val image : Int, val text : String)

fun myLanguage(): MutableList<Language> {
    val list  = mutableListOf<Language>()
    list.add(Language(R.drawable.ic_launcher_foreground,"Jetpack Compose"))
    list.add(Language(R.drawable.ic_launcher_foreground,"Jetpack Compose"))
    list.add(Language(R.drawable.ic_launcher_foreground,"Jetpack Compose"))
    list.add(Language(R.drawable.ic_launcher_foreground,"Jetpack Compose"))
    list.add(Language(R.drawable.ic_launcher_foreground,"Jetpack Compose"))
    list.add(Language(R.drawable.ic_launcher_foreground,"Jetpack Compose"))
    list.add(Language(R.drawable.ic_launcher_foreground,"Jetpack Compose"))
    list.add(Language(R.drawable.ic_launcher_foreground,"Jetpack Compose"))

    return list
}