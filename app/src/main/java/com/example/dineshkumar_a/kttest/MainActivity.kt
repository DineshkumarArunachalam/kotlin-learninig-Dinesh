package com.example.dineshkumar_a.kttest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_test.text=" welcome dinesh to kotlin!"
        btn_click.setOnClickListener{
            val intent = Intent(this@MainActivity,SecondActivity::class.java);
            intent.putExtra("key","kotlin")
            startActivity(intent)
        }
        btn_image.setOnClickListener {
            btn_image.setImageResource(R.drawable.ic_launcher_foreground)
        }
        //list
        val myList =ArrayList<String>()
        myList.add("dinesh")
        Toast.makeText(this, myList.get(0), Toast.LENGTH_SHORT).show()

    }
}
