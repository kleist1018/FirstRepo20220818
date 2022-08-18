package com.softusing.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor getMpInterceptor(){
        //define a big interceptor for contain all small interceptor
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        //this interceptor can add inner interceptor
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}
