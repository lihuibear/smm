package com.itheima;

import com.itheima.service.BookService;
import com.itheima.config.SpringConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}
