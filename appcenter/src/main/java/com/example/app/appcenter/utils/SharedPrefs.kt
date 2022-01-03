@file:Suppress("unused")

package com.example.app.appcenter.utils

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.NonNull

internal const val PrefsFileName = "app_center_shared_prefs"

/**
 * Extension method for get SharedPreferences
 */
internal inline val Context.getPrefs: SharedPreferences
    get() = this.getSharedPreferences(
        PrefsFileName,
        Context.MODE_PRIVATE
    )

/**
 * Extension method for check SharedPreferences contain passed key
 *
 * @param fKey SharedPreferences Key witch you want to check
 */
internal fun Context.contain(@NonNull fKey: String): Boolean {
    return this.getPrefs.contains(fKey)
}

/**
 * Extension method for clear SharedPreferences object
 */
internal fun Context.clearPrefs() {
    this.getPrefs.edit().clear().apply()
}

/**
 * Extension method for remove SharedPreferences Key
 *
 * @param fKey SharedPreferences Key witch you want to remove
 */
internal fun Context.removeKey(@NonNull fKey: String) {
    this.getPrefs.edit().remove(fKey).apply()
}

/**
 * Extension method for Save Boolean Value
 *
 * @param fKey SharedPreferences Key
 * @param fValue Boolean Value
 */
internal fun Context.save(@NonNull fKey: String, @NonNull fValue: Boolean) {
    this.getPrefs.edit().putBoolean(fKey, fValue).apply()
}

/**
 * Extension method for get Boolean Value
 * with your pre-defined default value
 *
 * @param fKey SharedPreferences Key
 * @param fDefaultValue your pre-defined default value
 */
internal fun Context.getBoolean(@NonNull fKey: String, fDefaultValue: Boolean = false): Boolean {
    return this.getPrefs.getBoolean(fKey, fDefaultValue)
}

/**
 * Extension method for Save String Value
 *
 * @param fKey SharedPreferences Key
 * @param fValue String Value
 */
internal fun Context.save(@NonNull fKey: String, @NonNull fValue: String) {
    this.getPrefs.edit().putString(fKey, fValue).apply()
}

/**
 * Extension method for get String Value
 * with your pre-defined default value
 *
 * @param fKey SharedPreferences Key
 * @param fDefaultValue your pre-defined default value
 */
internal fun Context.getString(@NonNull fKey: String, fDefaultValue: String = ""): String {
    return this.getPrefs.getString(fKey, fDefaultValue) ?: fDefaultValue
}

/**
 * Extension method for Save Integer Value
 *
 * @param fKey SharedPreferences Key
 * @param fValue Int Value
 */
internal fun Context.save(@NonNull fKey: String, @NonNull fValue: Int) {
    this.getPrefs.edit().putInt(fKey, fValue).apply()
}

/**
 * Extension method for get Integer Value
 * with your pre-defined default value
 *
 * @param fKey SharedPreferences Key
 * @param fDefaultValue your pre-defined default value
 */
internal fun Context.getInt(@NonNull fKey: String, fDefaultValue: Int = 0): Int {
    return this.getPrefs.getInt(fKey, fDefaultValue)
}

/**
 * Extension method for Save Float Value
 *
 * @param fKey SharedPreferences Key
 * @param fValue Float Value
 */
internal fun Context.save(@NonNull fKey: String, @NonNull fValue: Float) {
    this.getPrefs.edit().putFloat(fKey, fValue).apply()
}

/**
 * Extension method for get Float Value
 * with your pre-defined default value
 *
 * @param fKey SharedPreferences Key
 * @param fDefaultValue your pre-defined default value
 */
internal fun Context.getFloat(@NonNull fKey: String, fDefaultValue: Float = 0f): Float {
    return this.getPrefs.getFloat(fKey, fDefaultValue)
}

/**
 * Extension method for Save Long Value
 *
 * @param fKey SharedPreferences Key
 * @param fValue Long Value
 */
internal fun Context.save(@NonNull fKey: String, @NonNull fValue: Long) {
    this.getPrefs.edit().putLong(fKey, fValue).apply()
}

/**
 * Extension method for get Long Value
 * with your pre-defined default value
 *
 * @param fKey SharedPreferences Key
 * @param fDefaultValue your pre-defined default value
 */
internal fun Context.getLong(@NonNull fKey: String, fDefaultValue: Long = 0): Long {
    return this.getPrefs.getLong(fKey, fDefaultValue)
}