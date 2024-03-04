package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.itheima")  // 扫描组件)
@PropertySource("{jdbc.properties}")  // 加载jdbc.properties文件)

public class SpringConfig {
}
