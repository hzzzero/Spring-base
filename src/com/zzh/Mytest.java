package com.zzh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void Test1(){
        ApplicationContext r=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student a=(Student) r.getBean("MyString");
        System.out.println(a);
    }
}
