package edu.tec.challenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.tec.challenge.databinding.FragmentInicioBinding


class InicioFragment : Fragment() {
    lateinit var binding: FragmentInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInicioBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.iniciarB.setOnClickListener {

            val escrito = binding.editTextTextPersonName.text.toString()
            val action = InicioFragmentDirections.actionInicioFragmentToCapturaFragment(escrito)
            findNavController().navigate(action)
        }
    }


}