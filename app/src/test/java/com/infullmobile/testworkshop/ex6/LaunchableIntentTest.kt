package com.infullmobile.testworkshop.ex6

import android.app.Activity
import android.content.Intent
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

/* What if the guys who created my framework decided to not to give me access to half the stuff */
@RunWith(RobolectricTestRunner::class)
class LaunchableIntentTest {

    private lateinit var activity: Activity
    private lateinit var launchableIntent: LaunchableIntent
    private lateinit var intent: Intent

    @Before
    fun setUp() {
        activity = Robolectric.setupActivity(Activity::class.java)
        intent = Intent(activity, TestActivity::class.java)
        launchableIntent = LaunchableIntent(activity, intent)
    }

    @Test
    fun shouldStartActivity() {
        // when
        launchableIntent.start()

        // then
        // Hey ! Wait ! Android takes starting new activity from here. I can't check anything else.
    }

    private class TestActivity : Activity()
}