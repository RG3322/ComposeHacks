package com.fire.myapplication

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 *     actions:@Composable RowScope.()->Unit,
 *     content:@Composable ()->Unit
 *     onExpanded : ()->Unit,
 *     onCollapsed : ()->Unit
 *
 *
 *
 * THIS IS THE MAIN COMPOSABLE USED IN CREATION ODF THE SWIPING GESTURE
 */


@Composable
fun SwipeGesture(
    isRevealed: Boolean,
    modifier: Modifier =Modifier,
    actions:@Composable RowScope.()->Unit,
    onCollapsed : ()->Unit = {},
    onExpanded : ()->Unit={},

    content:@Composable ()->Unit,


){






}


