package com.example.actividades_1_a_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.actividades_1_a_5.ui.theme.Actividades_1_a_5Theme
import com.example.actividades_1_a_5.Screens.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Actividades_1_a_5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Actividad1()
                    //Actividad2()
                    //Actividad3()
                    //Actividad4()
                    //Actividad5()
                }
            }
        }
    }
}
