package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//        System.out.println(dataSource);

//        1.加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); //立即加载
//        2.从文件系统下加载配置文件
//        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("F:\\code\\java\\smm\\spring\\spring_10_container\\src\\main\\resources\\applicationContext.xml");

//        BookDao bookDao = ctx.getBean("bookDao",BookDao.class);
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.save();
    }
}
