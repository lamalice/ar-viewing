package com.example.arviewing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.arviewing.databinding.ActivityMainBinding
import com.example.arviewing.databinding.ActivityProductViewBinding
import io.github.sceneview.ar.ArSceneView
import io.github.sceneview.ar.arcore.LightEstimationMode
import io.github.sceneview.ar.node.ArModelNode
import io.github.sceneview.ar.node.PlacementMode
import io.github.sceneview.math.Position

class ProductViewActivity  : AppCompatActivity() {

    private lateinit var binding: ActivityProductViewBinding
    private var arSceneView: ArSceneView? = null
    private lateinit var modelNode: ArModelNode
    private var productList: ArrayList<ProductModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        productList = Constants.defaultProductList()

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