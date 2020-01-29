package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    @Before("execution(* addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n============>>> Executing @Before advice on add account");
    }
}
