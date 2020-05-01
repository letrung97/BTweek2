package com.example.btweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.btweek2.login
import kotlinx.android.synthetic.main.login_activity.*
import kotlinx.android.synthetic.main.signup_activity.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        btn_signup.setOnClickListener{
            val intent5: Intent = Intent(this,singup::class.java)
            startActivity(intent5)
        }
    }
}
