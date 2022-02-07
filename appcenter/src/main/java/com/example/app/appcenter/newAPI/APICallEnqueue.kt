package com.example.app.appcenter.newAPI

import android.content.Context
import com.example.app.appcenter.model.MoreAppMainModel
import com.example.app.appcenter.newAPI.APIBuilder.getMainBaseUrl
import com.example.app.appcenter.newAPI.APIBuilder.getMainClient
import com.example.app.appcenter.utils.PKG_NAME
import com.example.app.base.helper.utils.isSDKBelow21
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext

object APICallEnqueue {

    suspend fun Context.getMoreAppResponse(
        fJob: Job,
        fListener: APIResponseListener<MoreAppMainModel>,
    ) {
        try {
            val response = withContext(fJob + Dispatchers.IO) {
                this@getMoreAppResponse.getMainClient.getMoreAppResponse(PKG_NAME)
            }
            fListener.onSuccess(response)
        } catch (e: Exception) {
            withContext(fJob + Dispatchers.Main) {
                fListener.onError(e.message)
            }
        }
    }
}