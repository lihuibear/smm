package com;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

    }
}
