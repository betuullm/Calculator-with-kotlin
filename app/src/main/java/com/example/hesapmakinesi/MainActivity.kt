package com.example.hesapmakinesi

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number1: Double? = null
    var number2: Double? = null
    var result: Double? = null

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
        Toast.makeText(this,"Welcome!",Toast.LENGTH_LONG)

    }

    fun Add(view: View){
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (number1!=null && number2!=null) {
            result = number1!! + number2!!
            binding.textResult.text="${number1} + ${number2} = ${result}"
        } else {
            val alert = Builder(this)
            alert.setTitle("Null Character").setIcon(R.drawable.warningsign)
            alert.setMessage("Please enter the numbers")
            alert.show()
        }


        //Toast.makeText(this,"Please enter numbers",Toast.LENGTH_LONG)
        //binding.textResult.text="Wrong proccess"
    }
    fun Subtraction(view: View){
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (number1!=null && number2!=null) {
            result = number1!! - number2!!
            binding.textResult.text="${number1} - ${number2} = ${result}"
        } else {
            val alert = Builder(this)
            alert.setTitle("Null Character").setIcon(R.drawable.warningsign)
            alert.setMessage("Please enter the numbers")
            alert.show()
        }
    }
    fun Multiplication(view: View){
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (number1!=null && number2!=null) {
            result = number1!! * number2!!
            binding.textResult.text="${number1} * ${number2} = ${result}"
        } else {
            val alert = Builder(this@MainActivity)
            alert.setTitle("Null Character").setIcon(R.drawable.warningsign)
            alert.setMessage("Please enter the numbers")
            alert.show()
        }

    }
    fun Division(view: View){
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (number1!=null && number2!=null) {
            result = number1!! / number2!!
            binding.textResult.text="${number1} / ${number2} = ${result}"
        } else {
            val alert = Builder(this)
            alert.setTitle("Null Character").setIcon(R.drawable.warningsign)
            alert.setMessage("Please enter the numbers")
            alert.show()
        }
    }



}