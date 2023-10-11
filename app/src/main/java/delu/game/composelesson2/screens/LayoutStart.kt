package delu.game.composelesson2.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import delu.game.composelesson2.R
import delu.game.composelesson2.ui.theme.DefaultBackground

@Composable
fun LayoutStart(getAllEmployees: () -> Unit, addEmployee: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Title()
        StartButtons(getAllEmployees, addEmployee)
    }
}

@Preview(showBackground = true)
@Composable
private fun Title() {
    Text(
        modifier = Modifier
            .background(DefaultBackground)
            .height(dimensionResource(R.dimen.title_height).value.dp)
            .wrapContentHeight()
            .padding(start = 8.dp)
            .fillMaxWidth(),
        text = stringResource(id = R.string.practical_task),
        textAlign = TextAlign.Start,
        color = Color.Black,
        fontSize = dimensionResource(R.dimen.title_text_size).value.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif
    )
}

@Composable
private fun StartButtons(getAllEmployees: () -> Unit, addEmployee: () -> Unit) {

    val addEmployeeText = stringResource(R.string.add_company_employee)
    val allEmployeesText = stringResource(R.string.all_employees)

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
                .height(dimensionResource(R.dimen.start_layout_button_height).value.dp)
                .width(dimensionResource(R.dimen.start_layout_button_width).value.dp)
                .wrapContentHeight(),
            textAlign = TextAlign.Center,
            text = stringResource(R.string.select_available_action),
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif
        )

        OneButton(allEmployeesText, getAllEmployees)
        Spacer(modifier = Modifier.height(4.dp))
        OneButton(addEmployeeText, addEmployee)
    }
}

@Composable
private fun OneButton(buttonText: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .height(dimensionResource(R.dimen.start_layout_button_height))
            .width(dimensionResource(R.dimen.start_layout_button_width)),
        colors = ButtonDefaults.buttonColors(containerColor = DefaultBackground),
        shape = MaterialTheme.shapes.medium,
        onClick = onClick
    ) {
        Text(
            text = buttonText,
            fontFamily = FontFamily.SansSerif,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }
}

