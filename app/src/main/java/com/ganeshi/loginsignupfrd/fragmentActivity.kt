package com.ganeshi.loginsignupfrd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ganeshi.loginsignupfrd.databinding.ActivityFragmentBinding

class fragmentActivity : AppCompatActivity() {
    lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragmen1tBtn.setOnClickListener {
           // replaceFragment(SignupActivity())
        }
        binding.fragment2Btn.setOnClickListener {

        }
    }

    private fun replaceFragment(fragment:Fragment) {
        val fragmenetManager = supportFragmentManager
        val fragmentTransaction = fragmenetManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()

    }
}