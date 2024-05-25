package com.example.easymovie.ui.activity

import android.content.Intent
import androidx.fragment.app.FragmentActivity


open class LeanbackActivity : FragmentActivity() {
    override fun onSearchRequested(): Boolean {
        startActivity(Intent(this, SearchActivity::class.java))
        return true
    }
}