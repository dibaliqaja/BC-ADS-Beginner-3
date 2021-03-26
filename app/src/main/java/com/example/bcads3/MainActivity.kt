package com.example.bcads3

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_blog.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah anda yakin ingin keluar?")
            .setPositiveButton("Ya", DialogInterface.OnClickListener{dialogInterface, i ->
                Toast.makeText(this, "Thank you for your support!", Toast.LENGTH_SHORT).show()
                finish()
            })
            .setNegativeButton("Batal", DialogInterface.OnClickListener{dialogInterface, i ->

            }).show()
    }
}