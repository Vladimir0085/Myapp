package com.vladimserg0085.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

const val TAG = "MainActivity"
const val KEY = "text_Top"

class MainActivity : AppCompatActivity() {

    lateinit var textTop: TextView

    private var a = "Мороз и солнце; день чудесный!"
    private var b = "Еще ты дремлешь, друг прелестный —"
    private var c = "Пора, красавица, проснись:"
    private var d = "Открой сомкнуты негой взоры"
    private var e = "Навстречу северной Авроры,\n" +
            "Звездою севера явись!"
    private var f = "Спасибо."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTop = findViewById(R.id.text_top)
        val leftButton: Button  = findViewById(R.id.left_button)
        val centerButton: Button = findViewById(R.id.center_button)
        val rightButton: Button = findViewById(R.id.right_button)

        centerButton.setOnClickListener {
            textTop.text = "пойдешь - жив будешь, да себя позабудешь."
        }

        leftButton.setOnClickListener {
            textTop.text = "пойдешь - коня потеряешь."
        }

        rightButton.setOnClickListener {
            textTop.text = "пойдешь - жизнь потеряешь."
        }

        if (savedInstanceState !=null) {
            textTop.text = savedInstanceState.getString(KEY)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(KEY, textTop.text as String?)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, a)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, b)
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, c)
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, d)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, e)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, f)
    }
}