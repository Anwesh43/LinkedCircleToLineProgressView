package com.anwesh.uiprojects.circletolineprogressview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.anwesh.uiprojects.lctpview.LCTPView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : LCTPView = LCTPView.create(this)
        fullScreen()
        view.addAnimationListener({createToast("animation ${it + 1} is completed")}, {createToast("animation ${it + 1} is reset") })
    }

    private fun createToast(msg : String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

fun MainActivity.fullScreen() {
    supportActionBar?.hide()
    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
}
