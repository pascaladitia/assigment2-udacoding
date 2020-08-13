package com.example.assigment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.assigment2.calculator.CalculatorActivity
import com.example.assigment2.recyclerview.RecyclerviewActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btn_calculator.setOnClickListener(this)
        btn_recyclerview.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.btn_calculator -> {
                val intent = Intent(this@Dashboard, CalculatorActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_recyclerview -> {
                val intent = Intent(this@Dashboard, RecyclerviewActivity::class.java)
                startActivity(intent)
            }
        }
    }
}