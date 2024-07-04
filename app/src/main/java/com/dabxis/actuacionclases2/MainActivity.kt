package com.dabxis.actuacionclases2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dabxis.actuacionclases2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener{
            val numero = binding.ingreseNum.text.toString()
            if (numero.isNotEmpty()){
                val num = numero.toDouble()
                val resultado = determinarSigno(num)
                binding.resultado.text = resultado
            } else {
                Toast.makeText(this, "Por favor ingrese un numero", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun determinarSigno(num: Double): String {
        return when{
            num > 0 -> "El número es positivo"
            num < 0 -> "El numero es negativo"
            else -> "El numeor es cero"
        }

    }
}