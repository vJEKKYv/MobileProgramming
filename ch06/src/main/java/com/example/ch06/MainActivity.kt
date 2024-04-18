package com.example.ch06

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //setContentView(R.layout.layout_stack_test)
        //setContentView(R.layout.match_wrap_test)
        //setContentView(R.layout.margein_padding_test)
        //setContentView(R.layout.visible_test)
        /*
        val visibleBtn = findViewById<Button>(R.id.visibleBtn)
        val invisibleBtn:Button = findViewById<Button>(R.id.invisibleBtn)
        val targetView = findViewById<TextView>(R.id.TargetView)
        visibleBtn.setOnClickListener{
            targetView.visibility= View.VISIBLE
        }
        invisibleBtn.setOnClickListener{
            targetView.visibility= View.INVISIBLE
        }
         */
        setContentView(R.layout.kakao_pw_check)
        val confirmBtn = findViewById<Button>(R.id.confirmBtn)
        val passwd = findViewById<EditText>(R.id.psswd)
        var check:Int =1
        confirmBtn.setOnClickListener{
            if (check==1){
                passwd.visibility = View.INVISIBLE
                check = 0
            }else{
                passwd.visibility = View.VISIBLE
                check = 1
            }
        }
    }
}