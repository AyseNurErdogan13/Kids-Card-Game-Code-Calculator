package com.example.kidscardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        var btn_click_me = findViewById(R.id.button3) as Button

        var img_view = findViewById(R.id.imageView2) as ImageView

        var img_count = 0 as Int

        btn_click_me.setOnClickListener {
            if(img_count<=3){
                img_count++
                if(img_count==1){
                    img_view.setImageResource(R.drawable.arkaplan_3)
                }
                else if(img_count==2){
                    img_view.setImageResource(R.drawable.arkaplan_4)
                }
                else if(img_count==3){
                    img_view.setImageResource(R.drawable.arkaplan_5)
                }
                else if(img_count==4){
                    img_view.setImageResource(R.drawable.arkaplan_6)
                    btn_click_me.setText("BİLMECEYİ ÇÖZ")
                }
            }
            else{
                val intent = Intent(this@GameActivity, BilmeceActivity::class.java)
                startActivity(intent)
            }
        }
    }
}