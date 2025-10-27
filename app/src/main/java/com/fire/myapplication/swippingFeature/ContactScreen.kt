package com.fire.myapplication.swippingFeature
/*
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.iicons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ContactScreen(){

    val context = LocalContext.current
    val contacts = remember{
        mutableListOf(
            *(1..100).map {
        ContactUI(
            id = it,
            name = "Contact $it",
            isOptionRevealed = false
        )
    }.toTypedArray())
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {

        itemsIndexed(
            items = contacts,
            key = { _, contact -> contact.id}
        ){
            index, contact ->
            SwipeGesture(
                isRevealed = contact.isOptionRevealed,
                {
                    ActionIcon(
                        onClick = {
                            contacts.remove(contact)
                            Toast.makeText(context,"Contact Deleted",
                                Toast.LENGTH_SHORT).show()
                        },
                    backgroundColor = Color.Red,
                    icon = Icons.Default.Delete,
                        modifier = Modifier.fillMaxHeight())


                    ActionIcon(
                        onClick = {
                            contacts.remove(contact)
                            Toast.makeText(context,"Contact mailed",
                                Toast.LENGTH_SHORT).show()
                        },
                        backgroundColor = Color.Blue,
                        icon = Icons.Default.Email,
                        modifier = Modifier.fillMaxHeight())


                    ActionIcon(
                        onClick = {
                            contacts.remove(contact)
                            Toast.makeText(context,"Contact Shared",
                                Toast.LENGTH_SHORT).show()
                        },
                        backgroundColor = Color.Green,
                        icon = Icons.Default.Share,
                        modifier = Modifier.fillMaxHeight())



                }



            ){}

        }



    }
}

@Preview(showBackground = true)
@Composable
fun ContactScreenPreview(){
    ContactScreen()
}

*/