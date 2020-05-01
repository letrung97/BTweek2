package com.example.btweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_letstart.setOnClickListener{
            val intent1: Intent = Intent(this,activity_connexion::class.java)
            startActivity(intent1)
        }
    }
}
