package com.example.base.helper.moreappshelper

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.appcenter.MoreApps

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onMoreAppClick(view: android.view.View) {
        MoreApps.with(this@MainActivity)
            .setAppPackageName("com.vehicle.rto.vahan.status.information.register")
            .setTextColor(Color.BLUE)
            .setThemeColor(Color.RED)
            .setShareIcon(R.drawable.ic_share_blue)
            .setBackIcon(R.drawable.ic_new_header_back)
            .setShareMessage("abc")
            .launch()
    }
}