package com.ajocard.fastlanestarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Fabric.with(this, Crashlytics())
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun forceCrash(view: View) {
        throw RuntimeException("This is a crash")
    }

}
