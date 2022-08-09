package com.dy.mall.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.dy.mall.order.dao")
public class MybatisPlusConfig {


}
