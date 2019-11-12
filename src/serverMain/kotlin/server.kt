package tenki.server

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.slf4j.event.Level

fun main() {
    embeddedServer(
        Netty,
        port = 8080,
        host = "localhost",
        module = Application::module
    ).apply { start(wait = true) }
}

fun Application.module() {
    install(DefaultHeaders)
    install(CallLogging) {
        level = Level.TRACE
    }

    // Run [tenki.server.ServerKt] task or main() function
    routing {
        // Root
        get("/") {
            call.respondText("Hello World!", ContentType.Text.Plain)
        }
        // Demo EP for testing environment
        get("/demo") {
            call.respondText("This is a demo!")
        }
        // WIP
    }
}