package com.impression.ensapayagent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ScrollView
import androidx.core.app.NavUtils
import androidx.core.widget.NestedScrollView

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)



    }

    override fun onBackPressed() = NavUtils.navigateUpFromSameTask(this)

    fun back(view: View) = NavUtils.navigateUpFromSameTask(this)


}
