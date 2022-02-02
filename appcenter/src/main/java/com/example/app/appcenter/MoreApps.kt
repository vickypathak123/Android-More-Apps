package com.example.app.appcenter

import android.app.Activity
import android.content.Intent
import androidx.annotation.DrawableRes
import androidx.annotation.NonNull
import java.io.Serializable

internal const val ARG_THEME_COLOR = "theme_color"
internal const val ARG_THEME_TEXT_COLOR = "text_color"
internal const val ARG_BACK_ICON = "back_icon"
internal const val ARG_SHARE_ICON = "share_icon"
internal const val ARG_SHARE_MSG = "share_msg"
internal const val ARG_APP_PACKAGE_NAME = "app_package_name"

var themeColor: Int? = null
var textColor: Int? = null

/**
 * @author Akshay Harsoda
 * @since 16 Oct 2021
 */
@Suppress("unused")
object MoreApps {

    @JvmStatic
    fun with(fContext: Activity): Request {
        return Request(fContext)
    }
}

/**
 * @author Akshay Harsoda
 * @since 16 Oct 2021
 */
@Suppress("unused")
class Request(private val mContext: Activity) : Serializable {

    private var mAppPackageName: String = ""
    private var mShareMsg: String = ""
    private var mThemeColor: Int = 0
    private var mTextColor: Int = 0
    private var mBackIcon: Int = 0
    private var mShareIcon: Int = 0

    @JvmName("setAppPackageName")
    @NonNull
    fun setAppPackageName(fPackageName: String) = this@Request.apply {
        this.mAppPackageName = fPackageName
    }

    //<editor-fold desc="Setting Dialog">
    @JvmName("setShareMessage")
    @NonNull
    fun setShareMessage(fMessage: String) = this@Request.apply {
        this.mShareMsg = fMessage
    }

    @JvmName("setThemeColor")
    @NonNull
    fun setThemeColor(fColor: Int) = this@Request.apply {
        this.mThemeColor = fColor
    }

    @JvmName("setTextColor")
    @NonNull
    fun setTextColor(fColor: Int) = this@Request.apply {
        this.mTextColor = fColor
    }

    @JvmName("setBackIcon")
    @NonNull
    fun setBackIcon(@DrawableRes id: Int) = this@Request.apply {
        this.mBackIcon = id
    }

    @JvmName("setShareIcon")
    @NonNull
    fun setShareIcon(@DrawableRes id: Int) = this@Request.apply {
        this.mShareIcon = id
    }
    //</editor-fold>

    //<editor-fold desc="Launch More Apps Screen">
    @JvmName("launch")
    fun launch() {
        val themeColorConvert = "#" + Integer.toHexString(mThemeColor).substring(2)
        val textColorConvert = "#" + Integer.toHexString(mTextColor).substring(2)

        val moreAppIntent = Intent(mContext, MoreAppsActivity::class.java)
            .putExtra(ARG_THEME_COLOR, themeColorConvert)
            .putExtra(ARG_THEME_TEXT_COLOR, textColorConvert)
            .putExtra(ARG_BACK_ICON, mBackIcon)
            .putExtra(ARG_SHARE_ICON, mShareIcon)
            .putExtra(ARG_SHARE_MSG, mShareMsg)
            .putExtra(ARG_APP_PACKAGE_NAME, mAppPackageName)

        mContext.startActivity(moreAppIntent)
    }
    //</editor-fold>

}