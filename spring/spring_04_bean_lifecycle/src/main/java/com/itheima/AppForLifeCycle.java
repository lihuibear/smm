package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ctx.registerShutdownHook();//注册关闭钩子 在容器未关闭之前，提前设置好回调函数，让JVM在退出之前回调此函数来关闭容器 在任何时间都可以

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        ctx.close(); // 暴力关闭
    }
}
