package com.udacity.shoestore.models

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding

class ShoeDetailFragment : Fragment() {

    private lateinit var binding: FragmentShoeDetailBinding

    //Add the shoeListViewModel and make it accessible to both Detail and ShoeList Fragments
    private val viewModel: ShoeListViewModel by activityViewModels()

    private lateinit var newShoe: Shoe

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_shoe_detail,
            container,
            false
        )

        binding.shoeListViewModel = viewModel

        cancelAction()

        return binding.root
    }

    private fun cancelAction() {
        binding.buttonCancel.setOnClickListener {
            view?.findNavController()
                ?.navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
        }
    }


}