package com.example.app.appcenter.widgets

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.Window
import com.example.app.appcenter.adapter.BackAppsAdapter
import com.example.app.appcenter.databinding.DialogLayoutBackpressedBinding
import com.example.app.appcenter.model.Data
import com.example.app.appcenter.themeColor
import com.example.app.base.helper.utils.*

class BackPressedDialog(
        private val activity: Activity,
        data: ArrayList<Data>,
        private val onShareClick: () -> Unit,
        private val onExitClick: () -> Unit
) : Dialog(activity) {
    
    private var mBinding: DialogLayoutBackpressedBinding

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        mBinding = DialogLayoutBackpressedBinding.inflate(LayoutInflater.from(activity))
        setContentView(mBinding.root)

        window?.let {
            it.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            it.setLayout((context.displayWidth * .90).toInt(), (context.displayHeight * .80).toInt())
        }

        setCancelable(false)
        setCanceledOnTouchOutside(false)

        data.reverse()
        mBinding.backRvMoreApps.adapter = BackAppsAdapter(context, data)

        // setup theme color
        themeColor?.let {
            with(mBinding) {
                recTitle.setBackgroundColor(it)
                tvExit.setBackgroundColor(it)
                tvCancel.setBackgroundColor(it)
            }
        }

        mBinding.tvExit.setOnClickListener { onExitClick.invoke() }

        mBinding.tvCancel.setOnClickListener { dismiss() }

        mBinding.ivShare.setOnClickListener { onShareClick.invoke() }
    }

    fun showBackPressedDialog() {
        if (!activity.isFinishing && !isShowing) {
            show()
        }
    }
}