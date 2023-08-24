package com.example.lab2.Activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.lab2.R

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        // Agregar un botón para enviar el chat
        val boton_envio = findViewById<Button>(R.id.boton_enviar)
        boton_envio.setOnClickListener {
            //Envia el chat
            sendMessageto2()
        }

        val boton_cambiar = findViewById<Button>(R.id.boton_cambiar)
        boton_cambiar.setOnClickListener {
            //cambia el chat
            val intent2 = Intent(this, ReceptionChatActivity::class.java)
            startActivity(intent2)
        }


            // Obtener el mensaje de la intención
            val messagefr2 = intent.getStringExtra("message")

            // Mostrar el mensaje en el TextView
            val mostrarto1 = findViewById<TextView>(R.id.recibir_del2)
            mostrarto1.text = messagefr2





        }



    private fun sendMessageto2() {
        // Obtener el mensaje del EditText
        val message = findViewById<EditText>(R.id.chat_enviar).text.toString()

        // Enviar el mensaje a la actividad de recepción
        val intent = Intent(this, ReceptionChatActivity::class.java)
        intent.putExtra("message", message)
        startActivity(intent)
    }

}
