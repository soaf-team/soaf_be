package com.soaf.soaf_be.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {

    private static final String API_NAME = "Around Hub Studion";
    private static final String API_VERSION = "1.0.0";
    private static final String API_DESCRIPTION = "어라운드 허브 스튜디오 스프링 부트 레포지토리입니다.";

    @Bean
    public OpenAPI OpenAPIConfig() {
        return new OpenAPI()
                .info(new Info().title(API_NAME).description(API_DESCRIPTION).version(API_VERSION));
    }
}