package com.dharamveer.bird_image_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform