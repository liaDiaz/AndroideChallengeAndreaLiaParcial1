package edu.tec.challenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.tec.challenge.data.Tarea
import edu.tec.challenge.databinding.FragmentCapturaBinding
import java.text.SimpleDateFormat
import java.util.*


class CapturaFragment : Fragment() {

    lateinit var binding: FragmentCapturaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCapturaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.titulo.text = "${arguments?.getString("nombre")} TO DO LIST "

        binding.agregarB.setOnClickListener {
            val nombreTarea = binding.nombreTareaText.text.toString()
            val descripcionTarea = binding.descripcionText.text.toString()
            val prioridadTarea = binding.prioridadText.text.toString()
            val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val tareas = Tarea(nombreTarea,descripcionTarea,prioridadTarea,timeStamp)


            val action = CapturaFragmentDirections.actionCapturaFragmentToListaFragment2(tareas)

            findNavController().navigate(action)



        }



    }


}