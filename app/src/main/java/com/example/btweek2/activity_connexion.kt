package com.example.btweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_connexion.*

class activity_connexion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connexion)
        btn_account.setOnClickListener{
            val intent2: Intent = Intent(this,singup::class.java)
            startActivity(intent2)
        }
        btn_login1.setOnClickListener{
            val intent3: Intent = Intent(this,login::class.java)
            startActivity(intent3)
        }
    }
}
