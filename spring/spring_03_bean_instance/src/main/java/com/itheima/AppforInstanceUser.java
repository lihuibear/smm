package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.dao.UserDao;
import com.itheima.factory.UserDaofactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppforInstanceUser {
    public static void main(String[] args) {
//        UserDaofactory userDaofactory = new UserDaofactory();
//        UserDao userDao = userDaofactory.getUserDao();
//        userDao.save();

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();

    }
}