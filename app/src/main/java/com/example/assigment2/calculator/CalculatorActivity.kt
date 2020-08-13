package com.example.assigment2.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.assigment2.R
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btn_tambah.setOnClickListener(this)
        btn_kurang.setOnClickListener(this)
        btn_bagi.setOnClickListener(this)
        btn_kali.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.btn_tambah -> {
                tambah()
            }
            R.id.btn_kurang -> {
                kurang()
            }
            R.id.btn_bagi -> {
                bagi()
            }
            R.id.btn_kali -> {
                kali()
            }
        }
    }

    private fun tambah() {
        if (edt_number1.text.toString().isEmpty() || edt_number2.text.toString().isEmpty()) {
            Toast.makeText(this, "Input harus di isi", Toast.LENGTH_SHORT).show()
        } else {
            val a = edt_number1.text.toString().toDouble()
            val b = edt_number2.text.toString().toDouble()
            val c = this.tambah(a, b)
            edt_hasil.setText(c.toString())
        }
    }

    private fun kurang() {
        if (edt_number1.text.toString().isEmpty() || edt_number2.text.toString().isEmpty()) {
            Toast.makeText(this, "Input harus di isi", Toast.LENGTH_SHORT).show()
        } else {
            val a = edt_number1.text.toString().toDouble()
            val b = edt_number2.text.toString().toDouble()
            val c = this.kurang(a, b)
            edt_hasil.setText(c.toString())
        }
    }

    private fun kali() {
        if (edt_number1.text.toString().isEmpty() || edt_number2.text.toString().isEmpty()) {
            Toast.makeText(this, "Input harus di isi", Toast.LENGTH_SHORT).show()
        } else {
            val a = edt_number1.text.toString().toDouble()
            val b = edt_number2.text.toString().toDouble()
            val c = this.kali(a, b)
            edt_hasil.setText(c.toString())
        }
    }

    private fun bagi() {
        if (edt_number1.text.toString().isEmpty() || edt_number2.text.toString().isEmpty()) {
            Toast.makeText(this, "Input harus di isi", Toast.LENGTH_SHORT).show()
        } else {
            val a = edt_number1.text.toString().toDouble()
            val b = edt_number2.text.toString().toDouble()
            val c = this.bagi(a, b)
            edt_hasil.setText(c.toString())
        }
    }

    fun kurang (a: Double, b: Double): Double {
        return a - b
    }

    fun tambah (a: Double, b: Double): Double {
        return a + b
    }

    fun kali (a: Double, b: Double): Double {
        return a * b
    }

    fun bagi (a: Double, b: Double): Double {
        return a / b
    }
}