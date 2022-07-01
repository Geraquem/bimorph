package com.mmfsin.bimorph

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mmfsin.bimorph.presentation.category.CategoryFragment
import com.mmfsin.bimorph.presentation.category.CategoryPresenter
import com.mmfsin.bimorph.presentation.dualism.DualismFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, CategoryFragment()).commit()
    }
}