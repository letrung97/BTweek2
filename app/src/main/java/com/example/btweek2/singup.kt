package com.example.btweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.signup_activity.*

class singup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_activity)
        btn_login1.setOnClickListener{
            val intent4: Intent = Intent(this,login::class.java)
            startActivity(intent4)
        }
    }
}
