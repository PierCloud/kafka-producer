package kp.com.example.swagger.docs;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Api(value="kafka-produce", tags="controller doc di kafka producer")
public class SwaggerConfig
{
    /*
     * URL Swagger: http://localhost:9000/swagger-ui.html
     * Docs: https://swagger.io/docs/
     */
    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("kp.com.example.controller"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
                .title("ARTICOLI WEB SERVICE API")
                .description("Spring Boot REST API")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }


}