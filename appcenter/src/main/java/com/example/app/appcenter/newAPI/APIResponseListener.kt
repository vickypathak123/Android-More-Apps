package com.example.app.appcenter.newAPI

import androidx.annotation.UiThread

interface APIResponseListener<T> {
    @UiThread
    fun onSuccess(fResponse : T)
    @UiThread
    fun onError(fErrorMessage: String?)
}