package com.skillbox.informburo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_sreen.*

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_sreen)

        loginButton.isEnabled = false

        loginButton.setOnClickListener {
            if (editTextEmailAddress.text.isNotEmpty() && editTextPassword.text.isNotEmpty()) {
                loginButton.isEnabled
            } else !loginButton.isEnabled
        }

    }
}