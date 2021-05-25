package com.skillbox.informburo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_sreen.*

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_sreen)

        loginButton.isEnabled = true

        loginButton.setOnClickListener{
            Toast.makeText(this, "Login complete!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loginCheck(): Boolean {
        return editTextEmailAddress.text.isNotEmpty() && editTextPassword.text.isNotEmpty()
    }
}