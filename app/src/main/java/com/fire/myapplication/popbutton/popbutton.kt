package com.fire.myapplication.popbutton

/*import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FloatingActionButtonMenu
import androidx.compose.material3.FloatingActionButtonMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ToggleFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.fire.myapplication.R


@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun PopButton(
    modifier : Modifier = Modifier
) {

    var expanded by remember {
        mutableStateOf(false)
    }

    FloatingActionButtonMenu(
        expanded = expanded,
        button = {
            ToggleFloatingActionButton(
                checked = expanded,
                onCheckedChange = { expanded = it }
            )
            {

                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), // TODO: Replace with your desired icon
                    contentDescription = null,
                    tint = if (expanded) {
                        MaterialTheme.colorScheme.onPrimaryContainer
                    } else {
                        MaterialTheme.colorScheme.onSurfaceVariant
                    }
                )
            }
        }

    ) {
        items.forEach { item ->
            FloatingActionButtonMenuItem(
                onClick = { /* TODO: Handle item click */ expanded = false },
                text = {
                    Text(text = item.text)
                },
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = item.icon),
                        contentDescription = item.text
                    )
                }
            )
        }
    }
}

val items = listOf(
    PopButtonItem(
        text = "Event",
        icon = R.drawable.ic_launcher_foreground
    ),
    PopButtonItem(
        text = "Task",
        icon = R.drawable.ic_launcher_foreground
    ),
    PopButtonItem(
        text = "Note",
        icon = R.drawable.ic_launcher_foreground
    )
)
data class PopButtonItem(
    val text: String,
    val icon: Int
)
*/

