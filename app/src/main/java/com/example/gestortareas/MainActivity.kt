package com.example.gestortareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                Tareas(Tareas("Tarea 1","Hacer los deberes","Baja","-----------------------------------------"))
                Tareas2(Tareas("Tarea 2","Estudiar para examen","Alta","-----------------------------------------"))
                Tareas3(Tareas("Tarea 3","Beber mucha agua","Media","-----------------------------------------"))
                Tareas2(Tareas("Tarea 4","Poner la mesa","Alta","-----------------------------------------"))
                Tareas(Tareas("Tarea 5","Limpiar tu cuarto","Baja","-----------------------------------------"))

            }

        }
    }
}

data class Message(val Titulo: String)
data class Tareas(val tareas: String,val descripcion: String, val prioridad:String, val separador: String)

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
            Text(text = msg.prioridad,
                Modifier.background(Color.Green)
            )
            Text(text = msg.separador,
                fontWeight = FontWeight.Bold
            )

           
        } 
        Row {
            Image(painter = painterResource(R.drawable.tick),
                contentDescription = " ",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape))

        }
        Image(painter = painterResource(R.drawable.polish_20231024_175556917),
            contentDescription = " " ,
            modifier = Modifier
                .size(40.dp)
        )
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
            Text(text = msg.prioridad,
                Modifier.background(Color.Red)
            )
            Text(text = msg.separador,
                fontWeight = FontWeight.Bold)
        }
        Row {
            Image(painter = painterResource(R.drawable.xroja),
                contentDescription = " ",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape))

            Image(painter = painterResource(R.drawable.polish_20231024_175556917),
                contentDescription = " " ,
                modifier = Modifier
                    .size(40.dp)
            )
        }

    }
}
@Composable
fun Tareas3(msg: com.example.gestortareas.Tareas){
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
            Text(text = msg.prioridad,
                Modifier.background(Color.Yellow)
            )
            Text(text = msg.separador,
                fontWeight = FontWeight.Bold)
        }
        Row {
            Image(painter = painterResource(R.drawable.xroja),
                contentDescription = " ",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape))
            Image(painter = painterResource(R.drawable.polish_20231024_175556917),
                contentDescription = " " ,
                modifier = Modifier
                    .size(40.dp)
            )
        }


    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}