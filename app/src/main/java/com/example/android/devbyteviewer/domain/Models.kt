package com.example.android.devbyteviewer.domain

import com.example.android.devbyteviewer.util.smartTruncate

data class DevByteVideo(
    val title: String,
    val description: String,
    val url: String,
    val updated: String,
    val thumbnail: String
) {

    val shortDescription: String
        get() = description.smartTruncate(200)
}