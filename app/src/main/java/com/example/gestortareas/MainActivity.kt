package com.example.gestortareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestortareas.ui.theme.GestorTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Titulo(Message("Gestor de tareas"))
                Tareas(Tareas("Tarea 1","Hacer los deberes"))
                Tareas2(Tareas("Tarea 2","Estudiar para examen"))
                Tareas(Tareas("Tarea 3","Beber mucha agua"))
                Tareas2(Tareas("Tarea 4","Poner la mesa"))
                Tareas(Tareas("Tarea 5","Limpiar tu cuarto"))
                Tareas(Tareas("Tarea 6","Tender la ropa"))
                Tareas2(Tareas("Tarea 7","Corregir bien esta práctica"))

            }



        }
    }
}

data class Message(val Titulo: String)
data class Tareas(val tareas: String,val descripcion: String)

@Composable
fun Titulo(msg: com.example.gestortareas.Message){

    Column {
        Text(text = msg.Titulo,
       fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
}
@Composable
fun Tareas(msg: com.example.gestortareas.Tareas){
    Row (modifier = Modifier.padding(all = 13.dp)){
        Column {
           
            Surface(shape = MaterialTheme.shapes.medium, tonalElevation = 1.dp) {
           
            Text(text = msg.tareas,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(all = 4.dp),
                style = MaterialTheme.typography.bodyLarge
                )
            Spacer(modifier = Modifier.width(8.dp))
            }
            Text(text = msg.descripcion)
        } 
        Image(painter = painterResource(R.drawable.tick),
            contentDescription = " ",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp,MaterialTheme.colorScheme.secondary, CircleShape))

    }
}
@Composable
fun Tareas2(msg: com.example.gestortareas.Tareas){
    Row (modifier = Modifier.padding(all = 13.dp)){
        Column {

            Surface(shape = MaterialTheme.shapes.medium, tonalElevation = 1.dp) {

                Text(text = msg.tareas,
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.width(8.dp))
            }
            Text(text = msg.descripcion)
        }
        Image(painter = painterResource(R.drawable.xroja),
            contentDescription = " ",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp,MaterialTheme.colorScheme.secondary, CircleShape))

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}