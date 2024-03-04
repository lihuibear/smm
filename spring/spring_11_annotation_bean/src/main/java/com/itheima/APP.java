package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao =(BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService =ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
