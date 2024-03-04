package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.itheima")  // 扫描组件
@ComponentScan("com.itheima.dao")  // 扫描组件)

public class SpringConfig {
}
