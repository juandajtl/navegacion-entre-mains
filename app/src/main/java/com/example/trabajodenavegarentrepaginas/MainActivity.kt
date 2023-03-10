package com.example.trabajodenavegarentrepaginas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCalcular: Button = findViewById(R.id.button)
        botonCalcular.setOnClickListener { onCklic() }
    }

    private fun onCklic(){
        val text1: TextView=findViewById(R.id.textView)
        var nombre:String=text1.text.toString()

        val text2: TextView=findViewById(R.id.Txt)
        text2.text="bienvenido $nombre"

        Toast.makeText(this, "bienvenido $nombre ",Toast.LENGTH_SHORT).show()
    }

}