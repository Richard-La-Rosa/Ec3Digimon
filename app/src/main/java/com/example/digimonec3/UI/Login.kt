package com.example.digimonec3.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.digimonec3.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var  binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener{
            val email = binding.tilEmail.editText?.text.toString()
            val password =  binding.tilPassword.editText?.text.toString()

            if ( email== "asd" && password == "123asd"){

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "contraseña equivocada", Toast.LENGTH_LONG).show()

            }

        }
    }
}