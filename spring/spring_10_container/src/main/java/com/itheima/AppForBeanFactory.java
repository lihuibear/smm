package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class AppForBeanFactory {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory bf = new XmlBeanFactory(resource); //延迟加载
//        BookDao bookDao = bf.getBean(BookDao.class);
//        bookDao.save();

    }
}
