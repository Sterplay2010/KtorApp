package com.freeman

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.freeman.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "localhost") {
        configureRouting()
        configureTemplating()
    }.start(wait = true)
}
