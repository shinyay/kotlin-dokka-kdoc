package io.pivotal.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Entry Class
 * @author shinyay
 */
@SpringBootApplication
class SpringAppApplication

/**
 * Entry point
 */
fun main(args: Array<String>) {
	runApplication<SpringAppApplication>(*args)
}
