package com.ganeshi.loginsignupfrd

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ganeshi.loginsignupfrd.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val name = intent.getStringExtra("username")
//         binding.username.apply {
//            text = name
//        }
//
//        val password = intent.getStringExtra("password")
//        binding.userPassword.apply {
//            text = password
//        }

        val userData = intent.getSerializableExtra("username") as? UserData
        if (userData != null) {

            val data = "Username: ${userData.username}\n" +
                    "Password: ${userData.password}\n" +
                    "Number: ${userData.number}\n" +
                    "Address: ${userData.address}\n" +
                    "isAdmin: ${userData.isAdmin}"

            val textView = binding.username
            textView.text = data
        }

    }

}