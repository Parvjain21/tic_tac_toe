package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var flag : Int = 0
    private var count : Int = 0
    private lateinit var btn1 : Button
    private lateinit var btn2 : Button
    private lateinit var btn3 : Button
    private lateinit var btn4 : Button
    private lateinit var btn5 : Button
    private lateinit var btn6 : Button
    private lateinit var btn7 : Button
    private lateinit var btn8 : Button
    private lateinit var btn9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }
    fun check (view : View){

        val currBtn : Button = view as Button
        if(currBtn.text == "") {
            count++
            when (flag) {
                0 -> {
                    currBtn.text = "X"
                    flag = 1
                }

                1 -> {
                    currBtn.text = "O"
                    flag = 0
                }
            }
            if(count > 4) {
                if (btn1.text == btn2.text && btn2.text == btn3.text && btn1.text != "") {
                    winGame(btn1)
                } else if (btn4.text == btn5.text && btn5.text == btn6.text && btn4.text != "") {
                    winGame(btn4)
                } else if (btn7.text == btn8.text && btn8.text == btn9.text && btn7.text != "") {
                    winGame(btn7)
                } else if (btn1.text == btn4.text && btn4.text == btn7.text && btn1.text != "") {
                    winGame(btn1)
                } else if (btn2.text == btn5.text && btn5.text == btn8.text && btn2.text != "") {
                    winGame(btn2)
                } else if (btn3.text == btn6.text && btn6.text == btn9.text && btn3.text != "") {
                    winGame(btn3)
                } else if (btn1.text == btn5.text && btn5.text == btn9.text && btn1.text != "") {
                    winGame(btn1)
                } else if (btn3.text == btn5.text && btn5.text == btn7.text && btn3.text != "") {
                    winGame(btn3)
                }else if(count == 9){
                    reset()
                }
            }

        }
    }
    private fun winGame(view : View){
        val btn : Button = view as Button
        Toast.makeText(this, "player ${btn.text} won the game", Toast.LENGTH_SHORT).show()
        reset()
    }
    private fun reset(){
        flag = 0
        count = 0
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""
    }
    private fun init(){
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
    }
}