package com.thomsonreuters.cs.onvio.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform