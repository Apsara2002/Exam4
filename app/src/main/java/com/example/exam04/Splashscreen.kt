package com.example.exam04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class Splashscreen : AppCompatActivity() {

    private lateinit var  appname: TextView
    private lateinit var lottie: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        appname=findViewById(R.id.appname)
        lottie=findViewById(R.id.lottie)

        appname.animate().translationY(-900f).setDuration(2700).setStartDelay(0)
        //lottie.animate().translationX(2000f).setDuration(2000).setStartDelay(2900)

        Handler().postDelayed({
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },10000)
    }
}