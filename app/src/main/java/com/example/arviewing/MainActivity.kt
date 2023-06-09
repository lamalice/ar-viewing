package com.example.arviewing


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.arviewing.databinding.ActivityMainBinding

import io.github.sceneview.ar.ArSceneView
import io.github.sceneview.ar.arcore.LightEstimationMode
import io.github.sceneview.ar.node.ArModelNode
import io.github.sceneview.ar.node.PlacementMode
import io.github.sceneview.math.Position


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var arSceneView: ArSceneView? = null
    private lateinit var modelNode: ArModelNode


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arSceneView = binding.arSceneView

        arSceneView = binding.arSceneView.apply {
            lightEstimationMode = LightEstimationMode.ENVIRONMENTAL_HDR_NO_REFLECTIONS
        }

        modelNode = ArModelNode(PlacementMode.INSTANT).apply {
            loadModelGlbAsync(
                glbFileLocation = "models/handpainted_watercolor_cake.glb",
                scaleToUnits = 1f,
                centerOrigin = Position(-0.5f)
            )
            {
                arSceneView!!.planeRenderer.isVisible = true
            }
        }
        arSceneView!!.addChild(modelNode)
        modelNode.anchor()
        arSceneView!!.planeRenderer.isVisible = false

    }

}


