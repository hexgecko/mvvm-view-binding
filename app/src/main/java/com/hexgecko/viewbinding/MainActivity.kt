package com.hexgecko.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hexgecko.viewbinding.databinding.ActivityMainBinding
import com.hexgecko.viewbinding.util.bindOnClick
import com.hexgecko.viewbinding.util.bindText
import com.hexgecko.viewbinding.viewmodel.MainActivityModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Get the view model
        val viewModel = ViewModelProvider(this).get(MainActivityModel::class.java)

        // Bind the on click and text to the view-model.
        ActivityMainBinding.inflate(layoutInflater).let {
            it.button.bindText(this, viewModel.numberOfClickText)
            it.button.bindOnClick(viewModel::onIncreaseCounter)
            setContentView(it.root)
        }
    }
}
