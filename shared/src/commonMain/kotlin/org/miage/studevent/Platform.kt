package org.miage.studevent

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform