package com.example.mad_24012011028_practical_2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG ="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display(msg="onCreate method is called")
    }

    override fun onStart() {
        super.onStart()
        display("onStart method is called")
    }

    override fun onResume() {
        super.onResume()
        display("onResume method is called")
    }
    override fun onPause() {
        super.onPause()
        display("onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        display("onStop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        display("onDestroy method is called")
    }
    fun display(msg : String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
//        Snackbar.make(findViewById(R.id.main), msg, Snackbar.LENGTH_SHORT).show()
    }
}