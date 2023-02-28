package com.example.myapplication22

import com.example.myapplication22.databinding.ActivityMainBinding

class Presenter {


    private val model = Model()
    lateinit var view: View

    fun increment(){

model.increment()
        view.showCount(model.count)
        if(model.count == 10){
            view.showToast()
        }
        if (model.count == 15){
            view.textColorChange()
        }
        else{
            view.textColorBack()
        }
    }

    fun decrement(){

        model.decrement()
        view.showCount(model.count)
        if(model.count == 10){
            view.showToast()
        }
        if (model.count == 15){
            view.textColorChange()
        }
        else{
            view.textColorBack()
        }
    }


    fun fillCounterView(view: View){
this.view = view
}
}