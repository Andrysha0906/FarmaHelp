package com.example.farmahelp1.addPill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.farmahelp1.R

class MainActivityAddPill : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_pills)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_add_pills)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.create_one_well).setOnClickListener {
            val intent = Intent(this, MainActivityCreatOneWell::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.create_several_courses).setOnClickListener {
            val intent = Intent(this, MainActivityCreateSeveralCourse::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_create_procedure).setOnClickListener {
            val intent = Intent(this, MainActivityCreateProcedure::class.java)
            startActivity(intent)
        }

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}