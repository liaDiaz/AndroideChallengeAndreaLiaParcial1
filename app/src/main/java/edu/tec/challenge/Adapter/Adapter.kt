package edu.tec.challenge.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.tec.challenge.R
import edu.tec.challenge.data.Tarea

class Adapter(private val lista:List<Tarea>):
    RecyclerView.Adapter<Adapter.AdapterViewHolder>() {
    private var clickListener: ClickListener? = null

    fun setOnItemClickListener(clickListener: ClickListener) {
        this.clickListener = clickListener
    }
    interface ClickListener{
        fun onItemClick(view: View,position: Int)
    }
    inner class AdapterViewHolder(view: View):
    RecyclerView.ViewHolder(view), View.OnClickListener {
        val nombreTarea: TextView =view.findViewById(R.id.titulo)
        val Timestamp: TextView =view.findViewById(R.id.texto)
        val prioridad: TextView =view.findViewById(R.id.texto2)
        fun bind(elemento:Tarea){
            nombreTarea.text=elemento.nombreTarea
            Timestamp.text=elemento.Timestamp
            prioridad.text=elemento.prioridad

        }
        init {
            view.setOnClickListener(this)
        }
        override fun onClick(view: View?) {
            if(view != null) {
                clickListener?.onItemClick(view, bindingAdapterPosition)
            }
        }
    }

    //Construye el renglon pero no da los datos a los eleemntos graficos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):AdapterViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.renglon,parent,false)
        return AdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        val elemento=lista[position]
        holder.bind(elemento)
    }

    override fun getItemCount()=lista.size

    fun getData(position: Int): Tarea{
        return lista[position]
    }

}