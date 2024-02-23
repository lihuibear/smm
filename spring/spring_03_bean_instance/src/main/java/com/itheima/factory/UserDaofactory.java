package com.itheima.factory;

import com.itheima.dao.OrderDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.OrderDaoImpl;
import com.itheima.dao.impl.UserDaoImpl;

public class UserDaofactory {
    public UserDao getUserDao() {
        System.out.println("factory setup ...");
        return new UserDaoImpl();
    }

}
