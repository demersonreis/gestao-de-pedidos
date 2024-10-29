package com.gestaodepedidos.gestao_de_pedidos_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {


	@Bean
	OpenAPI springShopOpenAPI() {
	    return new OpenAPI()
	            .info(new Info().title("Gestão Pedidos")
	                    .version("v0.0.0")
	                    .license(new License().name("Apache 2.0").url("http://springdoc.org")))
	            .externalDocs(new ExternalDocumentation()
	                    .description("Documento contendo todas as regras de negócio.")
	                    .url("https://springshop.wiki.github.org/docs"))
	            .components(new Components()
	                    .addSecuritySchemes("bearer-key", new SecurityScheme()
	                            .type(SecurityScheme.Type.HTTP)
	                            .scheme("bearer")
	                            .bearerFormat("JWT")))
	            .addSecurityItem(new SecurityRequirement().addList("bearer-key"));
	}
}

