package com.itheima;

import com.itheima.service.impl.BookServiceImpl;

public class APP {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }
}
