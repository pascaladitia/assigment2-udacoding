package com.example.assigment2.recyclerview

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.assigment2.R
import kotlinx.android.synthetic.main.activity_recyclerview.*
import kotlinx.android.synthetic.main.detail_list_item.*

class RecyclerviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val list = ArrayList<Anggota>()
        list.add(Anggota("pascal", R.drawable.call, "sukabumi"))
        list.add(Anggota("aditia", R.drawable.ic_baseline_account_circle_24, "bogor"))
        list.add(Anggota("muclis", R.drawable.ic_baseline_account_circle_24, "jakarta"))
        list.add(Anggota("ujang", R.drawable.ic_baseline_account_circle_24, "bogor"))
        list.add(Anggota("agus", R.drawable.ic_baseline_account_circle_24, "jakarta"))
        list.add(Anggota("ucok", R.drawable.ic_baseline_account_circle_24, "bogor"))
        list.add(Anggota("rama", R.drawable.ic_baseline_account_circle_24, "jakarta"))

        recyclerView.adapter = RecyclerviewAdapter(this, list, object : RecyclerviewAdapter.OnClickListener {

            override fun detail(item: Anggota) {
                Dialog(this@RecyclerviewActivity).apply {
                    requestWindowFeature(Window.FEATURE_NO_TITLE)
                    setCancelable(true)
                    setContentView(R.layout.detail_list_item)

                    val image = this.detail_image
                    val nama = this.detail_nama
                    val alamat = this.detail_alamat
                    val close = this.btn_close

                    image.setImageResource(item.foto ?: 0)
                    nama.text = "Nama : ${item.nama}"
                    alamat.text = "Alamat : ${item.alamat}"

                    close.setOnClickListener {
                        this.dismiss()
                    }
                }.show()
            }
        })
    }
}