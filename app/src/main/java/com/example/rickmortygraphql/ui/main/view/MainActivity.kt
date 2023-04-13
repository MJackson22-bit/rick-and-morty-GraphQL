package com.example.rickmortygraphql.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rickmortygraphql.R
import com.example.rickmortygraphql.databinding.ActivityMainBinding
import com.example.rickmortygraphql.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}