package edu.tec.challenge.data

import android.os.Parcelable

import  kotlinx.parcelize.Parcelize

@Parcelize
data class Tarea(val nombreTarea: String, val descripcion: String, val prioridad: String,val Timestamp: String) : Parcelable  {


}
