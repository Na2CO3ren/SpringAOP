package com.robin.spring.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext cnt = new ClassPathXmlApplicationContext("calculator.xml");
//
//        ArithmeticCalculator calculator = (ArithmeticCalculator)cnt.getBean("arithmeticCalculator");
//        System.out.println("1 + 2 = " + calculator.add(1,2));

        ArithmeticCalculator calculator = new ArithmeticCalculatorImpl();
        ArithmeticCalculator proxy = new ArithmeticCalculatorProxy(calculator).getCalculator();
        proxy.add(1,2);

    }
}
