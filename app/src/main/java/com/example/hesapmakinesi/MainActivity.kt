package com.example.hesapmakinesi

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    fun Add(view: View){
        val number1 = binding.editTextNumber1.text.toString()
        val number2 = binding.editTextNumber2.text.toString()
        val result = number1.toInt() + number2.toInt()
        binding.textResult.text="${number1} + ${number2} = ${result}"
        //Toast.makeText(this,"Please enter numbers",Toast.LENGTH_LONG)
        //binding.textResult.text="Wrong proccess"
    }
    fun Subtraction(view: View){
        val number1 = binding.editTextNumber1.text.toString()
        val number2 = binding.editTextNumber2.text.toString()
        val result = number1.toInt() - number2.toInt()
        binding.textResult.text="${number1} - ${number2} = ${result}"

    }
    fun Multiplication(view: View){
        val number1 = binding.editTextNumber1.text.toString()
        val number2 = binding.editTextNumber2.text.toString()
        val result = number1.toInt() * number2.toInt()
        binding.textResult.text="${number1} * ${number2} = ${result}"

    }
    fun Division(view: View){
        val number1 = binding.editTextNumber1.text.toString()
        val number2 = binding.editTextNumber2.text.toString()
        val result = number1.toDouble() / number2.toDouble()
        binding.textResult.text="${number1} / ${number2} = ${result}"

    }



}