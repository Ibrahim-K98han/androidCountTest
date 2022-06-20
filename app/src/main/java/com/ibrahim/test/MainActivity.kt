package com.ibrahim.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   lateinit var countTv:TextView
   lateinit var addBtn:Button
   lateinit var subBtn:Button
   private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countTv = findViewById(R.id.countTV)
        addBtn = findViewById(R.id.addBtn)
        subBtn = findViewById(R.id.subBtn)
        count = savedInstanceState?.getInt("count") ?:0
        countTv.text = count.toString()
        addBtn.setOnClickListener {
            count++
            countTv.text = count.toString()
        }
        subBtn.setOnClickListener {
            countTv.text = count.toString()
            if(count >0){
                count--
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("count", count)
        super.onSaveInstanceState(outState)
    }
}