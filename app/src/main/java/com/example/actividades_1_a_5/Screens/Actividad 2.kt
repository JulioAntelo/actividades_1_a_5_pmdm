package com.example.actividades_1_a_5.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
/*         Actividad 2:
           Modifica ahora también que se separe el botón de la línea de progreso 30 dp,
           pero usando un estado... es decir, cuando no sea visible no quiero que tenga la separación
           aunque no se vea.
*/
@Preview(showBackground = true)
@Composable
fun Actividad2() {
    var showLoading by rememberSaveable { mutableStateOf(false) }

    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading) {
            CircularProgressIndicator(
                color = Color.Red,
                strokeWidth = 10.dp
            )
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 32.dp),
                color = Color.Red,
                trackColor = Color.LightGray
            )
        }
        var buttonText by rememberSaveable { mutableStateOf("Cargar perfil") }
        var paddingValue by rememberSaveable { mutableStateOf(0.dp) }
        Button(
            onClick = {
                showLoading = !showLoading
                buttonText = if (showLoading) "Cancelar" else "Cargar perfil"
                paddingValue = if (showLoading) 30.dp else 0.dp
                      },
            modifier = Modifier.padding(top = paddingValue)
        ) {
            Text(text = buttonText)
        }
    }
}
