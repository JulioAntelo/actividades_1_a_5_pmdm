package com.example.actividades_1_a_5.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


/*
Actividad 3:
- Separar los botones entre ellos 10 dp, del indicador de progreso 15 dp y centrarlos horizontalmente.
- Cuando se clique el botón Incrementar, debe añadir 0.1 a la propiedad progress y quitar 0.1
  cuando se pulse el botón Decrementar.
- Evitar que nos pasemos de los márgenes de su propiedad progressStatus (0-1)
*/
@Composable
fun Actividad3() {
    var progressValue by rememberSaveable { mutableStateOf(0f) }
    LinearProgressIndicator(progress = progressValue)

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LinearProgressIndicator(progress = 0f)

        Row(Modifier.fillMaxWidth()) {


            Button(
                onClick = {
                    if (progressValue < 1f) {
                        progressValue += 0.1f
                    }
                }
            ) {
                Text(text = "Incrementar")
            }

            Button(
                onClick = {
                    if (progressValue > 0f) {
                        progressValue -= 0.1f
                    }
                }
            ) {
                Text(text = "Reducir")
            }
        }
    }
}
