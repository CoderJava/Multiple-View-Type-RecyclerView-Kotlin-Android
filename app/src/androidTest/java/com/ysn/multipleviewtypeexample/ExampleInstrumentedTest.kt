/*
 * Created by YSN Studio on 5/6/18 7:58 PM
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 5/6/18 6:59 PM
 */

package com.ysn.multipleviewtypeexample

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.ysn.multipleviewtypeexample", appContext.packageName)
    }
}
