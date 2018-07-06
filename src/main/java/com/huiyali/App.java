package com.huiyali;


import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;

/**
 *在这里我们使用@SpringBootApplication指定这是一个spring boot的应用程序
*@Author:YahuiLi
*@Description:
*@param
*@Date:18:37 2018/6/19
*/
//extends WebMvcConfigurerAdapter
@SpringBootApplication
public class App {

/*
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        super.configureMessageConverters(converters);
        */
/*
        * 1.需要先定义一个convert转换消息对象
        * 2.添加fastJson的配置信息 比如：是否要格式化返回的json数据
        * 3.在convert中添加配置信息
        * 4.将convert添加到 converters当中
        * *//*


        //1.需要先定义一个convert 转换消息的对象；
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //2.添加fastJson的配置消息，比如:是否要格式化返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat
        );
        */
/*处理中文乱码问题*//*

        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
        //3.在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        //4.将convert添加到 converters当中
        converters.add(fastConverter);
    }
*/
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializationFeature.PrettyFormat);
    }

    /**
     * 在main方法中启动我们的应用程序
     *@Author:YahuiLi
     *@Description:
     *@param
     *@Date:18:38 2018/6/19
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}













