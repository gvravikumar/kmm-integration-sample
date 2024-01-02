package com.thomsonreuters.cs.onvio.shared

actual fun randomUUID(): String = java.util.UUID.randomUUID().toString()