package com.fire.myapplication.graphs

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaikeerthick.composable_graphs.composables.bar.BarGraph
import com.jaikeerthick.composable_graphs.composables.bar.style.BarGraphStyle
import com.jaikeerthick.composable_graphs.composables.bar.style.BarGraphVisibility
import com.jaikeerthick.composable_graphs.composables.line.LineGraph
import com.jaikeerthick.composable_graphs.composables.line.model.LineData
import com.jaikeerthick.composable_graphs.composables.line.style.LineGraphFillType
import com.jaikeerthick.composable_graphs.composables.line.style.LineGraphStyle
import com.jaikeerthick.composable_graphs.composables.pie.PieChart
import com.jaikeerthick.composable_graphs.composables.pie.model.PieData
import com.jaikeerthick.composable_graphs.style.LabelPosition



@Preview(showBackground = true)
@Composable
fun Graphs() {

    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxWidth().background(Color.Black).padding(16.dp).height(300.dp)
    ) {


        val data = listOf(LineData(x = "sun", y = 69,))
        LineGraph(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
            data = listOf(
                LineData(x = "Sun", y = 20),
                LineData(x = "Mon", y = 0),
                LineData(x = "Tue", y = 10),
                LineData(x = "Wed", y = 60),
                LineData(x = "Thu", y = 45),
                LineData(x = "Fri", y = 30),
                LineData(x = "Sat", y = 80),
            ),

            onPointClick = {},
        )

        Spacer(modifier = Modifier.height(200.dp))

        val pieChartData = listOf(
            PieData(value = 130F, label = "HTC", color = Color(0xFFE91E63)), // Pink
            PieData(value = 260F, label = "Apple", color = Color(0xFFFFC107)), // Amber
            PieData(value = 500F, label = "Google", color = Color(0xFF00BCD4)), // Cyan
        )


        PieChart(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .size(220.dp),
            data = pieChartData,
            onSliceClick = { pieData ->
                Toast.makeText(context, "${pieData.label}", Toast.LENGTH_SHORT).show()
            }
        )


    }
}



