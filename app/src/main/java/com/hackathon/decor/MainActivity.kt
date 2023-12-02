package com.hackathon.decor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hackathon.decor.databinding.ActivityMainBinding
import com.hackathon.decor.fragments.FragmentLogIn

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(binding.fragmentContainer.id, FragmentLogIn())
            .commit()
    }
}