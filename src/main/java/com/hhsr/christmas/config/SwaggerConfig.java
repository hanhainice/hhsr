package com.hhsr.christmas.config;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by hanhai on 2016/12/28.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //group:default
    @Bean
    public Docket configSpringfoxDocketForAll() {
        return new Docket(DocumentationType.SWAGGER_2)
                .produces(Sets.newHashSet("application/json"))
                .consumes(Sets.newHashSet("application/json"))
                .protocols(Sets.newHashSet("http", "https"))
                .forCodeGeneration(true)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "API Document",
                "API Document with swagger",
                "1.0.0",
                null,
                "xxxx@gmail.com",
                null,
                null
        );

        return apiInfo;
    }

}
