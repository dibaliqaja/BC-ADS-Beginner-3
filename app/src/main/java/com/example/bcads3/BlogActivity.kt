package com.example.bcads3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_blog.*

class BlogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        Toast.makeText(this, "Silahkan tunggu...", Toast.LENGTH_SHORT).show()
        webView.loadUrl("https://www.google.com/")
        webView.settings.javaScriptEnabled
    }
}