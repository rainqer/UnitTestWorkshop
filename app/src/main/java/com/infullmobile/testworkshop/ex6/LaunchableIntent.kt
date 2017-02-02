package com.infullmobile.testworkshop.ex6

import android.app.Activity
import android.content.Intent

open class LaunchableIntent(private val activity: Activity,
                            private val intent: Intent) {

    open fun start() {
        activity.startActivity(intent)
    }
}