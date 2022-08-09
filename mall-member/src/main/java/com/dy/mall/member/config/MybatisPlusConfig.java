package com.dy.mall.member.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.dy.mall.member.dao")
public class MybatisPlusConfig {


}
