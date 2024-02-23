package com.itheima.factory;

import com.itheima.dao.OrderDao;
import com.itheima.dao.impl.OrderDaoImpl;

public class OrderDaofactory {
    //饿汉式
    public static OrderDao getOrderDao() {
        System.out.println("factory setup ...");
        return new OrderDaoImpl();
    }
}
