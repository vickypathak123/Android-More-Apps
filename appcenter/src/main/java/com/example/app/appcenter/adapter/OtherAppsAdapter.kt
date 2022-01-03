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
import com.example.app.appcenter.databinding.ListItemOtherAppsBinding
import com.example.app.appcenter.model.SubCategory
import com.example.app.appcenter.themeColor
import com.example.app.appcenter.utils.rateApp
import com.example.app.appcenter.utils.shapeCategorySelectedDrawable
import com.example.app.base.helper.utils.roundToHalf


open class OtherAppsAdapter(
    private val mContext: Context,
    private val mApps: ArrayList<SubCategory>,
    val height: Int
) : RecyclerView.Adapter<BaseViewHolder<*>>() {

    // variable to track event time
    var mLastClickTime: Long = 0
    private val mMinDuration = 1500

    inner class MyViewHolder(fBinding: ListItemOtherAppsBinding) : BaseViewHolder<ListItemOtherAppsBinding>(fBinding)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return MyViewHolder(
            ListItemOtherAppsBinding.inflate(
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

        with(holder as MyViewHolder) {
            with(fBinding) {
                with(mApps[position]) {
                    listAppsIvThumb.layoutParams.width = height
                    listAppsIvThumb.layoutParams.height = height
                    listAppsIvThumb.requestFocus()

                     Glide.with(itemView)
                        .load(icon)
                        .placeholder(R.drawable.thumb_small)
                        .thumbnail(0.15f)
                        .into(listAppsIvThumb)

                    listAppsTvAppName.text = name
                    listAppsTvAppInstalls.text = installedRange

                    val rating = star.toFloat() * 2
                    val ratingRound = rating.toDouble().roundToHalf.toFloat()
                    listAppsMrAppRatings.setScore(ratingRound)

                    itemView.setOnClickListener(View.OnClickListener {
                        // Preventing multiple clicks, using threshold of mMinDuration second
                        if (SystemClock.elapsedRealtime() - mLastClickTime < mMinDuration) {
                            return@OnClickListener
                        }
                        mLastClickTime = SystemClock.elapsedRealtime()
                        mContext.rateApp(appLink)
                    })

                    listAppsMrAppRatings.setOnClickListener(View.OnClickListener {
                        // Preventing multiple clicks, using threshold of mMinDuration second
                        if (SystemClock.elapsedRealtime() - mLastClickTime < mMinDuration) {
                            return@OnClickListener
                        }
                        mLastClickTime = SystemClock.elapsedRealtime()
                        mContext.rateApp(appLink)
                    })

                    themeColor?.let {
                        listAppsIvAppBg.setColorFilter(
                            it,
                            android.graphics.PorterDuff.Mode.SRC_IN
                        )
                        listAppsIvAd.setColorFilter(
                            it,
                            android.graphics.PorterDuff.Mode.SRC_IN
                        )
//                        val roundedRectangle = RoundedRectangle(themeColor!!)
                        listAppsTvAppDownload.background = mContext.shapeCategorySelectedDrawable
                    }
                }
            }
        }
    }
}