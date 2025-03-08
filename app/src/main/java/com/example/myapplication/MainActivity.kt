package com.example.myapplication
import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var count = 0
    private var showCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showCount = findViewById<TextView>(R.id.show_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)
        val buttonCount = findViewById<Button>(R.id.button_count)

        buttonToast.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Hello Toast!",
                Toast.LENGTH_SHORT
            ).show()
        }

        buttonCount.setOnClickListener {
            count++
            showCount.setText(count.toString())
        }
    }
}
