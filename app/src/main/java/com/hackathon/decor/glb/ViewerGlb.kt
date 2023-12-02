package com.example.train_task_fill_car.utils.glb

import android.content.Context
import android.content.Intent
import android.net.Uri

class ViewerGlb(private val context: Context) {
    fun startActivityWithGlb(urlGlb: String = Constants.DEFAULT_GLB) {
        val sceneViewerIntent = Intent(Intent.ACTION_VIEW)
        sceneViewerIntent.data =
            Uri.parse("${Constants.GOOGLE_VIEWER_WITH_FILE}${urlGlb}")
        sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox")
        context.startActivity(sceneViewerIntent)
    }
}