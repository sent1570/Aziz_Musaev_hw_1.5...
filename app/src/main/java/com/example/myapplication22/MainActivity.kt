package com.example.myapplication22

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View {
    private val presenter = Presenter()
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.fillCounterView(this)
        initClicker()

    }
    private fun initClicker(){
        with(binding){
            incrementBtn.setOnClickListener{

                presenter.increment()
            }
            decrementBtn.setOnClickListener(){
                presenter.decrement()
            }

}
        }

    override fun showCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this,"Поздравляем!",Toast.LENGTH_SHORT).show()
    }

    override fun textColorChange() {
        binding.resultTv.setTextColor(Color.GREEN)
    }

    override fun textColorBack() {
       binding.resultTv.setTextColor(Color.GRAY)
    }

}


