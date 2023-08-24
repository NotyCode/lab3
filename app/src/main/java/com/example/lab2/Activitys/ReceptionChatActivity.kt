package com.example.lab2.Activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.lab2.R

class ReceptionChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reception_chat)

        // Agregar un botón para enviar el chat
        val boton_envio = findViewById<Button>(R.id.enviarto1)
        boton_envio.setOnClickListener {
            //Envia el chat
            sendMessageto1()
        }
        // Obtener el mensaje de la intención
        val message = intent.getStringExtra("message")

        // Mostrar el mensaje en el TextView
        val mostrar = findViewById<TextView>(R.id.chat_mostrar2)
        mostrar.text = message

        val button2 = findViewById<Button>(R.id.cambiar_chat)
        button2.setOnClickListener {
            // Volver a la actividad anterior
            onBackPressed()
        }
    }
    private fun sendMessageto1() {
        // Obtener el mensaje del EditText
        val message = findViewById<EditText>(R.id.chat_enviarto2).text.toString()

        // Enviar el mensaje a la actividad de recepción
        val intent = Intent(this, ChatActivity::class.java)
        intent.putExtra("message", message)
        startActivity(intent)
    }
}