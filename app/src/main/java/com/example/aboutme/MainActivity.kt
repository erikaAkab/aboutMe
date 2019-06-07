package com.example.aboutme

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        done_button?.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        nickname_text?.text = nickname_edit?.text
        nickname_text?.visibility = View.VISIBLE
        nickname_edit?.visibility = View.GONE
        done_button?.visibility = View.GONE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow( view.windowToken, 0)
    }
}
