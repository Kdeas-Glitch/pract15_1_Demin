package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val timer = object:CountDownTimer(3000,1000){
                override fun onTick(millisUntilFinished:Long){

                }
        override fun onFinish(){
            val intent = Intent(this@MainActivity,Onboard::class.java)
            startActivity(intent)
            finish()
        }
        }
        timer.start()
    }
}