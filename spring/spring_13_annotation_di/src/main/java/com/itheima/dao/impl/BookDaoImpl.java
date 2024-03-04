package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("BookDao")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;

    public void save() {
        System.out.println("book dao save ..."+name);
    }

}
