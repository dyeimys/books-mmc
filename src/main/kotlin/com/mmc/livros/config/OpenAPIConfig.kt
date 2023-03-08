package com.mmc.livros.config


import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenAPIConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
                .components(Components())
                .info(Info()
                        .version("0.0.0")
                        .title("A fantastic social network")
                        .description("A social network for reading lovers."))
    }
}