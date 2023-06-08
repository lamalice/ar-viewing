package com.example.arviewing


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.arviewing.databinding.ActivityMainBinding

import io.github.sceneview.ar.ArSceneView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var arSceneView: ArSceneView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arSceneView = binding.arSceneView

    }

}


