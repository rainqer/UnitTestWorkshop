package com.infullmobile.testworkshop.ex6

import android.app.Activity
import com.infullmobile.testworkshop.ex4.MainActivity

open class ActivityNavigation(private val activity: Activity) {

    open fun mainScreen(value: Int): LaunchableIntent {
        return LaunchableIntent(activity, MainActivity.getIntent(activity, value));
    }

    open fun onBackPressed() {
        activity.onBackPressed()
    }
}