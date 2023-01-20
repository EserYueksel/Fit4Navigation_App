package com.example.fit4navigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fit4navigation.databinding.FragmentTrainBinding

class TrainFragment: Fragment() {
    private lateinit var binding: FragmentTrainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTrainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var counter = requireArguments().getInt("counter")
        binding.counterText.text = counter.toString()
        binding.pushButton.setOnClickListener {
            counter --
            binding.counterText.text = counter.toString()

            if (counter == 0){
                findNavController().navigate(TrainFragmentDirections.actionTrainFragmentToEndFragment())
            }
        }
    }
}