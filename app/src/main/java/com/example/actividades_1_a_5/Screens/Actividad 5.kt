package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


/*
Actividad 5:
Haz lo mismo, pero elevando el estado a una función superior y usando un componente OutlinedTextField
al que debes añadir un padding alrededor de 15 dp y establecer colores diferentes en los bordes
cuando tenga el foco y no lo tenga.
A nivel funcional no permitas que se introduzcan caracteres que invaliden un número decimal.
*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Actividad5() {
    var Value by rememberSaveable { mutableStateOf("") }

    OutlinedTextFieldNuevo(
        value = Value,
        onValueChange = { Value = validarNumero(it) },
        label = "Importe",
        focusedBorderColor = Color.Green,
        unfocusedBorderColor = Color.Gray
    )
}

fun validarNumero(text: String): String {
    var TextoAValidar = text.replace(',', '.')
    if (TextoAValidar.count { it == '.' } > 1) {
        TextoAValidar = TextoAValidar.removeRange(TextoAValidar.lastIndexOf('.'), TextoAValidar.length)
    }
    return TextoAValidar
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextFieldNuevo(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    focusedBorderColor: Color,
    unfocusedBorderColor: Color
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        modifier = Modifier.padding(15.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = focusedBorderColor,
            unfocusedBorderColor = unfocusedBorderColor
        ),
    )
}