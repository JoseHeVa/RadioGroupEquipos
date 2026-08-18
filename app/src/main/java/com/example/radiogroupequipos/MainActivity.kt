package com.example.radiogroupequipos

import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rgEquipos = findViewById<RadioGroup>(R.id.rgEquipos)
        val tvSeleccion = findViewById<TextView>(R.id.tvSeleccion)

        // El RadioGroup garantiza por sí mismo que solo una opción
        // permanezca activa a la vez entre los RadioButton anidados.
        rgEquipos.setOnCheckedChangeListener { _, checkedId ->
            val equipo = when (checkedId) {
                R.id.rbRojo -> "Rojo"
                R.id.rbAzul -> "Azul"
                R.id.rbAmarillo -> "Amarillo"
                else -> "Ninguno"
            }
            tvSeleccion.text = "Equipo seleccionado: $equipo"
        }
    }
}
