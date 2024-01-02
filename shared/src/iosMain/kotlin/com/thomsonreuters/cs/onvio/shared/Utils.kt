package com.thomsonreuters.cs.onvio.shared

import platform.Foundation.NSUUID

actual fun randomUUID(): String = NSUUID().UUIDString()