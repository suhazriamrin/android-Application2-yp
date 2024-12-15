package com.suhazri.application2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.suhazri.application2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent()
            intent.action = "com.suhazri.application1"
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            try {
                startActivityForResult(intent, 1)
            } catch (e: Exception) {
                binding.textView4.text = "Something went wrong. ${e.message}"
            }
        }
    }
}