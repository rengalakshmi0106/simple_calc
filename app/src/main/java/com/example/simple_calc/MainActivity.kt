package com.example.simple_calc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1: EditText = findViewById(R.id.input1)
        val input2: EditText = findViewById(R.id.input2)
        val result: EditText = findViewById(R.id.result)

        val add: Button = findViewById(R.id.add)
        val sub: Button = findViewById(R.id.sub)
        val mul: Button = findViewById(R.id.mul)
        val div: Button = findViewById(R.id.div)
        val mod: Button = findViewById(R.id.mod)

        add.setOnClickListener {
            var firstno = input1.text.toString().toInt()
            var secondno = input2.text.toString().toInt()

            result.setText((firstno + secondno).toString())

        }
        sub.setOnClickListener {
            var firstno = input1.text.toString().toInt()
            var secondno = input2.text.toString().toInt()

            result.setText((firstno - secondno).toString())

        }
        mul.setOnClickListener {
            var firstno = input1.text.toString().toInt()

            var secondno = input2.text.toString().toInt()

            result.setText((firstno * secondno).toString())
        }

        div.setOnClickListener {
            var firstno = input1.text.toString().toInt()

            var secondno = input2.text.toString().toInt()

            result.setText((firstno / secondno).toString())
        }
        mod.setOnClickListener {
            var firstno = input1.text.toString().toInt()
            var secondno = input2.text.toString().toInt()

            result.setText((firstno % secondno).toString())

        }
    }
}