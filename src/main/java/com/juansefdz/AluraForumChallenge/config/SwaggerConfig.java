package com.juansefdz.AluraForumChallenge.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Alura Forum Challenge",
                version = "1.0",
                description = "API REST for Alura Forum Challenge"
        ),
        security = {
                @SecurityRequirement(name = "Spring Security", scopes = {"read", "write"})
        },
        extensions = {
                @Extension(
                        name = "Software Developers",
                        properties = {
                                @ExtensionProperty(name = "Juan Sebastián Fernández Montoya", value = "https://juansefdz.dev/"),


                        }
                )
        }
        )
public class SwaggerConfig {
}
