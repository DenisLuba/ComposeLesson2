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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import delu.game.composelesson2.screens.LayoutAddEmployee
import delu.game.composelesson2.screens.LayoutStart
import delu.game.composelesson2.ui.theme.ComposeLesson2Theme
import delu.game.composelesson2.ui.theme.DefaultBackground
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {

    companion object {
        const val LAYOUT_START = "LAYOUT_START"
        const val LAYOUT_EMPLOYEES = "LAYOUT_EMPLOYEES"
        const val LAYOUT_ADD_EMPLOYEE = "LAYOUT_ADD_EMPLOYEE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            ComposeLesson2Theme {
                NavHost(
                    navController = navController,
                    startDestination = LAYOUT_START
                ) {
                    composable(LAYOUT_START) {
                        LayoutStart (
                            { navController.navigate(LAYOUT_EMPLOYEES) },
                            { navController.navigate(LAYOUT_ADD_EMPLOYEE) }
                        )
                    }
                    composable(LAYOUT_EMPLOYEES) {

                    }
                    composable(LAYOUT_ADD_EMPLOYEE) {

                    }
                }
            }
        }
    }
}

