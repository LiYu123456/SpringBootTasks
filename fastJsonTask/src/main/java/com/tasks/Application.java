package com.tasks;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application
//        extends WebMvcConfigurerAdapter
{
    /**
     * 用继承方式配置FastJson
     * @param args
     */
    /*@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        FastJsonHttpMessageConverter fastJsonConverter=new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig=new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

        //处理中文乱码问题(不然出现中文乱码)
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastJsonConverter.setSupportedMediaTypes(fastMediaTypes);

        fastJsonConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastJsonConverter);
    }*/

    public static void main(String args[]){
        SpringApplication.run(Application.class,args);
    }
}
