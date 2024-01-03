package com.example.sdktest_appprotectt

import ai.protectt.app.security.common.helper.SDKConstants
import ai.protectt.app.security.main.AppProtecttInteractor
import ai.protectt.app.security.main.AppProtecttInteractor.Companion.setClientInfo
import ai.protectt.app.security.shouldnotobfuscated.dto.ClientInfo
import android.app.Application

class AppClass:Application() {
    override fun onCreate() {
        super.onCreate()
        AppProtecttInteractor.registerCallbackActivities(this)

        val clientInfo = ClientInfo()
        clientInfo.clientId = "2".toInt() //client id
        clientInfo.channelId = "2024".toInt() //channel id
        clientInfo.appName = "MyBank";//package name
        clientInfo.packageName = "com.example.mybank";//application name
        clientInfo.password =  "f89e2d201392414a91a89fc5e0f8f520" //channel id
        clientInfo.channelLicenseKey = "5b5320b7-0f3f-40bd-a85e-a36aa240b240" //activation key
        clientInfo.mainAppVersionCode = "${BuildConfig.VERSION_CODE}"
        clientInfo.appVersionName = BuildConfig.VERSION_NAME
        setClientInfo(clientInfo)


    AppProtecttInteractor(this).initAppProtectt(
    "SplashScreen",
    R.layout.alert_layout_logo,
    R.mipmap.ic_launcher,
    0,
    BuildConfig.BUILD_TYPE,
    SDKConstants.ALERT_DIALOG
    )
    }
}