package zmacadam.springpractice.springbootandkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringbootandkotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringbootandkotlinApplication>(*args)
}
