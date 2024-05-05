package com.soaf.soaf_be.config;

import com.soaf.soaf_be.interceptor.HttpInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(new HttpInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/hello");
    }
}