package com.thomsonreuters.cs.onvio.shared

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "${platform.name}!"
    }
}