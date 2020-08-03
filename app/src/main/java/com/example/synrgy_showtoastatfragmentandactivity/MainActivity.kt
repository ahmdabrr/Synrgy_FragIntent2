package com.example.synrgy_showtoastatfragmentandactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loading (Fragment1())
        btnActivityClass.setOnClickListener{
            var fragmentClass = supportFragmentManager.findFragmentById (frameLayoutContainer.id) as Fragment1
            fragmentClass.fragmentToastAct()
        }
    }

    private fun loading(fragment1: Fragment1) {
        supportFragmentManager.beginTransaction()
                .replace(frameLayoutContainer.id, fragment1)
                .commit()
    }

    fun munculToastAct() {
        Toast.makeText(this, "Toast ini di Activity, dijalankan dari Fragment", Toast.LENGTH_LONG).show()
    }
}