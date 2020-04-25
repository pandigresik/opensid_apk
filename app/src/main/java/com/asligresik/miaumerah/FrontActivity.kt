package com.asligresik.miaumerah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_front.*

class FrontActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)

        cvPortalDesa.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id")
            startActivity(intent)
        }

        cvLayanan.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/layanan_mandiri/masuk")
            startActivity(intent)
        }
        cvPengumuman.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/berita/kategori/pengumuman")
            startActivity(intent)
        }

        cvSop.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/sop")
            startActivity(intent)
        }

        cvPanduan.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/panduan")
            startActivity(intent)
        }

        cvAdminDesa.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MainActivity.PAGE_URL, "http://miaumerah.desa.id/siteman")
            startActivity(intent)
        }
    }
}
