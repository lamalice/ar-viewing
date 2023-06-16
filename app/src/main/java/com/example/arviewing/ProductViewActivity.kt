package com.example.arviewing

import android.graphics.Color
import android.graphics.ColorSpace.Rgb
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.arviewing.databinding.ActivityMainBinding
import com.example.arviewing.databinding.ActivityProductViewBinding
import io.github.sceneview.SceneView
import io.github.sceneview.ar.ArSceneView
import io.github.sceneview.ar.arcore.LightEstimationMode
import io.github.sceneview.ar.node.ArModelNode
import io.github.sceneview.ar.node.PlacementMode
import io.github.sceneview.math.Position
import io.github.sceneview.math.Rotation
import io.github.sceneview.math.Scale
import io.github.sceneview.node.ModelNode
import io.github.sceneview.utils.colorOf

class ProductViewActivity  : AppCompatActivity() {

    private lateinit var binding: ActivityProductViewBinding
    private var arSceneView: SceneView? = null
    private lateinit var modelNode: ModelNode
    private var productList: ArrayList<ProductModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productModel = intent.getStringExtra(PRODUCT_GLB_URL)

        productList = Constants.defaultProductList()
        arSceneView = binding.arSceneView

        modelNode = ModelNode(Position(x = 0.0f, y = 0.0f, z = 0.6f),
            Rotation(y = 90.0f),
            scale = Scale(0.5f)
            ).apply {

            loadModelGlbAsync(
                glbFileLocation = productModel.toString(),
                autoAnimate = true,
                scaleToUnits = .5f,
                centerOrigin = Position(),
                onError = { },
                onLoaded = { }
            )
        }
        arSceneView!!.addChild(modelNode)
        arSceneView!!.backgroundColor = colorOf(235F, 246F, 255F)

    }
}