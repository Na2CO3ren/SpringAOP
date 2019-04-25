package com.robin.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("application-context.xml");

        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator)cnt.getBean("arithmeticCalculator");
        System.out.println("1 + 1 = " + arithmeticCalculator.add(1,1));
    }
}
