package com.springboot.learn;


import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NoWebStarterMainTest {

    @Test
    public void testRun(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanDefinition.xml");
    }
}
