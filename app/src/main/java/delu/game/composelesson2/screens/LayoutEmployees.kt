package delu.game.composelesson2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
fun LayoutEmployees(buttonBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Title(buttonBack)
    }
}

@Composable
private fun Title(buttonBack: () -> Unit) {
    Row(
        modifier = Modifier
            .background(DefaultBackground)
            .height(dimensionResource(R.dimen.title_height).value.dp)
            .wrapContentHeight()
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Button(
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            onClick = buttonBack
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",
                tint = Color.Black
            )
        }

        Text(
            text = stringResource(id = R.string.all_employees),
            textAlign = TextAlign.Start,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.title_text_size).value.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun EmployeesList() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(count = 100) { itemId ->
            EmployeeItem(itemId)
        }
    }
}

@Composable
private fun EmployeeItem(itemId: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Image(
            painter = Painter(),
            contentDescription = "Employee",
            modifier = Modifier.size(dimensionResource(R.dimen.employee_photo).value.dp)
        )

        Column {
            Text(

            )
            Text(

            )
        }
    }
}