package com.testproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform