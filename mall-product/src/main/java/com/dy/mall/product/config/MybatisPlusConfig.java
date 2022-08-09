package com.dy.mall.product.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.dy.mall.product.dao")
public class MybatisPlusConfig {


}
