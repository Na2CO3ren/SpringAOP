package com.robin.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(double com.robin.spring.aop.ArithmeticCalculator.add(double,double))")
    public void beforeMethod(JoinPoint joinPoint) {
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("before method " + joinPoint.getSignature().getName() + "with param: " + args.toString());
    }
}
