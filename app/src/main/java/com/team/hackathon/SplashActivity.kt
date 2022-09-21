package com.team.hackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.team.hackathon.databinding.ActivityMainBinding

class SplashActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val currUser = FirebaseAuth.getInstance().currentUser
        if (currUser == null) {
          //login
        } else {
          //intent
        }
    }
}