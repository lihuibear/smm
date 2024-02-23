package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.factory.OrderDaofactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppforInstanceOrder {
    public static void main(String[] args) {
 //通过静态工厂创建对象
//        OrderDao orderDao = OrderDaofactory.getOrderDao();
//        orderDao.save();

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();

    }
}