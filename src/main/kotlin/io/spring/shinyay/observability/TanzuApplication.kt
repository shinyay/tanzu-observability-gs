package io.spring.shinyay.observability

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TanzuApplication

fun main(args: Array<String>) {
	runApplication<TanzuApplication>(*args)
}
