package com.robin.spring.calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ArithmeticCalculatorProxy {
    private ArithmeticCalculator target;

    public ArithmeticCalculatorProxy(ArithmeticCalculator arithmeticCalculator) {
        target = arithmeticCalculator;
    }

    public ArithmeticCalculator getCalculator() {
        ArithmeticCalculator proxy = null;

        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("Before invoke " + method.getName());
                Object result = method.invoke(target,args);
                System.out.println("After invoke " + method.getName());
                return result;
            }
        };
        proxy = (ArithmeticCalculator) Proxy.newProxyInstance(classLoader,interfaces,h);
        return proxy;
    }
}
