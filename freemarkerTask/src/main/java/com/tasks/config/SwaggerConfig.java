package com.tasks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .host("ps.bonc.com.cn")
//                .host("112.35.1.18:8081")
                .useDefaultResponseMessages(false)
                .select() //选择那些路径和api会生成document
                .apis(RequestHandlerSelectors.any())//对所有API进行监控
                .paths(PathSelectors.any())//对所有路径进行监控
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("FreeMarker相关内容")
                .description("简单优雅的restfun风格，http://blog.csdn.net/saytime")
                .version("2.0")
                .build();
    }
}
