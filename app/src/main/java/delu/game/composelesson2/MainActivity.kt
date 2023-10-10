package delu.game.composelesson2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import delu.game.composelesson2.ui.theme.ComposeLesson2Theme
import delu.game.composelesson2.ui.theme.DefaultBackground
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StartPage()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StartPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Title()
        StartButtons()
    }
}

@Preview(showBackground = true)
@Composable
fun Title() {
    Text(
        modifier = Modifier
            .background(DefaultBackground)
            .height(68.dp)
            .wrapContentHeight()
            .padding(start = 8.dp)
            .fillMaxWidth(),
        text = stringResource(id = R.string.practical_task),
        textAlign = TextAlign.Start,
        color = Color.Black,
        fontSize = 24.sp,
        fontWeight = Bold,
        fontFamily = FontFamily.SansSerif
    )
}

@Preview(showBackground = true)
@Composable
fun StartButtons() {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .wrapContentWidth()
            .fillMaxSize()
            .wrapContentWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Text(
            modifier = Modifier
                .height(dimensionResource(R.dimen.start_layout_button_height))
                .width(dimensionResource(R.dimen.start_layout_button_width))
                .wrapContentHeight(),
            textAlign = TextAlign.Center,
            text = stringResource(R.string.select_available_action),
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif
        )

        Button(
            modifier = Modifier
                .height(dimensionResource(R.dimen.start_layout_button_height))
                .width(dimensionResource(R.dimen.start_layout_button_width)),
            onClick = { getAllEmployees() },
            colors = ButtonDefaults.buttonColors(containerColor = DefaultBackground),
            shape = MaterialTheme.shapes.medium
        ) {
            Text(
                text = stringResource(id = R.string.all_employees),
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                fontWeight = Bold,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        Button(
            modifier = Modifier
                .height(dimensionResource(R.dimen.start_layout_button_height))
                .width(dimensionResource(R.dimen.start_layout_button_width)),
            onClick = { addEmployee() },
            colors = ButtonDefaults.buttonColors(containerColor = DefaultBackground),
            shape = MaterialTheme.shapes.medium
        ) {
            Text(
                text = stringResource(id = R.string.add_company_employee),
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                fontWeight = Bold,
                color = Color.Black
            )
        }
    }
}

private fun getAllEmployees()  {

}

private fun addEmployee() {

}