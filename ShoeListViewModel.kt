package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeListViewModel : ViewModel() {

    private var _shoeList: MutableLiveData<MutableList<Shoe>>()

    val shoeList: LiveData<MutableList<Shoe>>
        get() = _shoeList

    lateinit var newShoe: Shoe

    init {

        //Testing
        val testShoe: Shoe = Shoe(
            "RA II",
            9.5,
            "Vivobarefoot",
            "Minimal"
        )
        _shoeList.value?.add(testShoe)
        ///

    }

    fun addNewShoe(shoe: Shoe) {

        _shoeList.value?.add(shoe)
    }


}