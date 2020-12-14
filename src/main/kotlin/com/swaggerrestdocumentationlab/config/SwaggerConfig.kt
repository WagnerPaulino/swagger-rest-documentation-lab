package com.swaggerrestdocumentationlab

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.spi.DocumentationType
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.builders.PathSelectors

//@Configuration
open class SwaggerConfig {

//	@Bean
//	fun api(): Docket {
//		return Docket(DocumentationType.SWAGGER_2)
//			.select()
//			.apis(RequestHandlerSelectors.any())
//			.paths(PathSelectors.any())
//			.build();
//	}

}