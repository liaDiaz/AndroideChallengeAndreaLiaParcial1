package edu.tec.challenge.data

import java.text.SimpleDateFormat
import java.util.*

object TareaProvider {
    val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
    fun getData():List<Tarea>{
        return listOf(Tarea("Plan para el dominio mundial","Hacer plan","10", timeStamp),
            Tarea("Ejecucion dominar","Ejecutar dominio mundial","9",timeStamp),
            Tarea("Plan de contingencia","por si falla el primer plan","8",timeStamp),
            Tarea("Plan de Gobierno","Por si domino al mundo","7",timeStamp),
            Tarea("Comprar pan","No puedes dominar con el estomago vacio","6",timeStamp),
            Tarea("Adoptar un  gato","No se puede ser malo sin un gato","5",timeStamp),
            Tarea("Adoptar otra mascota","Soy alergico a los gatos","4",timeStamp),
            Tarea("Conseguir secuaz","Agendar entrevistas malvadas","3",timeStamp),
            Tarea("Descansar","Noche de belleza","2",timeStamp))

    }
}