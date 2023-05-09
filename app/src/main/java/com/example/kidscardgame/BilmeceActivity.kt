package com.example.kidscardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged

class BilmeceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bilmece)

        val inputs = ArrayList<EditText>()

        val kavustur_btn = findViewById(R.id.button_kavustur) as Button

        inputs.add(findViewById(R.id.editTextTextPersonName2))
        inputs.add(findViewById(R.id.editTextTextPersonName3))
        inputs.add(findViewById(R.id.editTextTextPersonName4))
        inputs.add(findViewById(R.id.editTextTextPersonName5))
        inputs.add(findViewById(R.id.editTextTextPersonName6))
        inputs.add(findViewById(R.id.editTextTextPersonName7))
        inputs.add(findViewById(R.id.editTextTextPersonName8))
        inputs.add(findViewById(R.id.editTextTextPersonName9))
        inputs.add(findViewById(R.id.editTextTextPersonName10))
        inputs.add(findViewById(R.id.editTextTextPersonName11))

        val answers = ArrayList<String>()
        answers.add("D")
        answers.add("I")
        answers.add("Ş")
        answers.add("T")
        answers.add("A")
        answers.add("R")
        answers.add("A")
        answers.add("F")
        answers.add("T")
        answers.add("A")

        kavustur_btn.setOnClickListener{
            val intent = Intent(this@BilmeceActivity, KavusmaActivity::class.java)
            startActivity(intent)
        }

        for (input in inputs){
            input.doAfterTextChanged {
                var is_true = true
                for(i in 0..9){
                    if(!inputs[i].text.toString().equals(answers[i]))
                        is_true = false
                }
                if(is_true){
                    Toast.makeText(this, "Doğru Cevapladın!", Toast.LENGTH_SHORT).show()
                    kavustur_btn.visibility = Button.VISIBLE
                }
            }
        }
    }
}