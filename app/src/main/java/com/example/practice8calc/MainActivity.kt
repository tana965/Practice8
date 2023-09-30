package com.example.practice8calc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    var num1:String = " "
    var num2: String = ""
    var symbol = " "
    fun btn00(view: View)
    {
        val btn = view as Button
        val text:TextView = findViewById(R.id.textViewMath)
        when (btn.id) {
            R.id.btn0 -> output("0")
            R.id.btn1 -> output("1")
            R.id.btn2 -> output("2")
            R.id.btn3 -> output("3")
            R.id.btn4 -> output("4")
            R.id.btn5 -> output("5")
            R.id.btn6 -> output("6")
            R.id.btn7 -> output("7")
            R.id.btn8 -> output("8")
            R.id.btn9 -> output("9")

            R.id.btnMulty -> {
                symbol = "*"
                num1 = text.text.toString()
                text.setText("").toString()
            }

            R.id.btnM->{
                        symbol = "-"
                num1 = text.text.toString()
                text.setText("").toString()

            }

            R.id.btnP ->{
                symbol = "+"
                num1 = text.text.toString()
                text.setText("").toString()


            }

            R.id.buttonD-> {
                symbol = "/"
                num1 = text.text.toString()
                text.setText("").toString()

            }

            R.id.buttonC -> text.text = ""
            R.id.btnE -> btnEquals(num1)

        }
    }



    fun output(str:String){
        val text:TextView = findViewById(R.id.textViewMath)
        text.append(str)
    }


    fun btnEquals(num1:String){
        val text: TextView = findViewById(R.id.textViewMath)
        var num1= num1
        num2 = text.text.toString()
        when(symbol){
            "+" -> text.text ="${(num1.toDouble() + num2.toDouble())}"
            "-" -> text.text ="${(num1.toDouble() - num2.toDouble())}"
            "*" -> text.text ="${(num1.toDouble() * num2.toDouble())}"
            "/" -> {
                if(num1.toInt()!=0){
                        text.text = "${(num1.toDouble() / num2.toDouble())}"
                    }
                    else {
                        val checkDataToast = Toast.makeText(this, "Ошибка:деление наноль!", Toast.LENGTH_SHORT)
                checkDataToast.show()
                    }

            }
        }
    }
}