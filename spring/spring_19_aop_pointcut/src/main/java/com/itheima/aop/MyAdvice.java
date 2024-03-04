package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    //切入点表达式：
//    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
//    @Pointcut("execution(void com.itheima.dao.impl.BookDaoImpl.up date())")
//    @Pointcut("execution(* com.itheima.dao.impl.BookDaoImpl.update(*))")    //no
//    @Pointcut("execution(void com.*.*.*.update())")
//    @Pointcut("execution(* *..*(..))")//匹配所有的

//    @Pointcut("execution(* *..u*(..))")//匹配开头是u
//    @Pointcut("execution(* *..*e(..))")//匹配结尾是e

//    @Pointcut("execution(void com..*())")
//    @Pointcut("execution(* com.itheima.*.*Service.find*(..))")
    //执行com.itheima包下的任意包下的名称以Service结尾的类或接口中的save方法，参数任意，返回值任意
    @Pointcut("execution(* com.itheima.*.*Service.save(..))")
    private void pt() {
    }

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
