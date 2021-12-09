package io.spring.shinyay.observability.controller

import io.spring.shinyay.observability.logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@RestController
@RequestMapping("/api/v1")
class DemoController {

    @GetMapping("/demo")
    fun hello(): String {
        val now =  ZonedDateTime.now(ZoneId.of("Japan")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))
        val message = "Hello at $now"
        logger.info(message)
        return message
    }
}
