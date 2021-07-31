package com.example.weekfourclasswork.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.weekfourclasswork.R

class PlayerDisplay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_display)

        var intent= intent
        val name = intent.getStringExtra("name")
        val  mobile= intent.getStringExtra("mobile")
        val  mail= intent.getStringExtra("mail")
        val  image= intent.getIntExtra("image",0)


        findViewById<TextView>(R.id.textView_PlayerName).text= name
        findViewById<TextView>(R.id.textView_PlayerPhone).text= mobile
        findViewById<TextView>(R.id.textView_PlayerEmail).text= mail
        findViewById<ImageView>(R.id.player_image).setImageResource(image)
    }
}