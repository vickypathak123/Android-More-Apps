package com.example.app.appcenter.adapter

import android.content.Context
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app.base.helper.BaseViewHolder
import com.example.app.appcenter.R
import com.example.app.appcenter.databinding.ListItemMoreAppsBinding
import com.example.app.appcenter.model.Data
import com.example.app.appcenter.utils.rateApp
import com.example.app.base.helper.utils.isValidContextForGlide


open class MoreAppsAdapter(private val mContext: Context, private val mApps: ArrayList<Data>) :
    RecyclerView.Adapter<BaseViewHolder<*>>() {

    // variable to track event time
    var mLastClickTime: Long = 0
    private val mMinDuration = 1500

    inner class MyViewHolder(fBinding: ListItemMoreAppsBinding) :
        BaseViewHolder<ListItemMoreAppsBinding>(fBinding)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return MyViewHolder(
            ListItemMoreAppsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return mApps.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        if (mContext.isValidContextForGlide) {

            with(holder as MyViewHolder) {
                with(fBinding) {
                    with(mApps[position]) {
                        Glide.with(itemView)
                            .load(thumbImage)
                            .placeholder(R.drawable.thumb_small)
                            .thumbnail(0.15f)
                            .into(listAppsIvThumb)

                        listAppsTvAppName.text = name
                        listAppsTvAppName.isSelected = true

                        itemView.setOnClickListener(View.OnClickListener {
                            // Preventing multiple clicks, using threshold of mMinDuration second
                            if (SystemClock.elapsedRealtime() - mLastClickTime < mMinDuration) {
                                return@OnClickListener
                            }
                            mLastClickTime = SystemClock.elapsedRealtime()
                            mContext.rateApp(packageName)
                        })
                    }
                }
            }
        }
    }
}