package com.fire.myapplication.swippingFeature

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.IntOffset
import kotlin.math.roundToInt


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
        @OptIn(ExperimentalFoundationApi::class)
        itemsIndexed(
            items = contacts,
            key = { _, contact -> contact.id}
        ){
            index, contact ->
            swipeableItemWithActions(
                isRevealed = contact.isOptionRevealed,
                onExpand = { contacts[index] = contact.copy(isOptionRevealed = true) },
                onCollapse = { contacts[index] = contact.copy(isOptionRevealed = false) },
                mainContent = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(16.dp)
                    ) {
                        Text(text = contact.name)
                    }
                }
            )
        }



    }
}

data class ContactUI(
    val id: Int,
    val name: String,
    val isOptionRevealed: Boolean
)

@Composable
fun swipeableItemWithActions(
    isRevealed: Boolean,
    onExpand: () -> Unit,
    onCollapse: () -> Unit,
    mainContent: @Composable () -> Unit,
) {
    val offsetX = remember { Animatable(0f) }

    LaunchedEffect(isRevealed) {
        if (isRevealed) {
            offsetX.animateTo(-100f * 3, animationSpec = tween(300)) // Adjust distance as needed
        } else {
            offsetX.animateTo(0f, animationSpec = tween(300))
        }
    }

    Box(
        modifier = Modifier
            .offset { IntOffset(offsetX.value.roundToInt(), 0) }
            .draggable(
                orientation = Orientation.Horizontal,
                state = rememberDraggableState { delta ->
                    val newOffset = offsetX.value + delta
                    if (newOffset < 0 && newOffset > -100f * 4) { // Bounds
                        // Use launch to avoid blocking drag events
                        // Using `trySnapTo` would be better if you don't need the animation effect
                        // For this simple case, `snapTo` is okay inside a LaunchedEffect or CoroutineScope
                        // But we will use `launch` here for demonstration
                        // CoroutineScope needs to be remembered
                        // A simple way is to use a launched effect that just allows us to call snap
                        //offsetX.snapTo(newOffset) //This can cause issues, let's use it differently
                    }
                },
                onDragStopped = { if (offsetX.value < -50f * 3) onExpand() else onCollapse() }
            )
    ) {
        mainContent()
    }
}