package com.example.springdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Aspect
@Component
public class ProjAspect  {
    Logger logger=LoggerFactory.getLogger(ProjAspect.class);
    @Around(value = "asp()")
    public Object arg
            (ProceedingJoinPoint joint) throws Throwable {
        for (Field declaredField : joint.getSignature().getDeclaringType().getDeclaredFields()) {
            System.out.println("felid class name -------"+declaredField.getType().getName());
        }
        if(joint.getArgs()==null){
           throw new Exception("cnmmmlssdee");
        }
        for (Object arg : joint.getArgs()) {
            if(null!=arg) {
                System.out.println(arg.getClass().getName());
                System.out.println("arg:"+arg.toString());
            }

        }

        logger.info(ProjAspect.class.getName()+"asp log**************");
        return joint.proceed();

    }

    @Pointcut(value = "execution(* com.example.springdemo.service..*.*(..))")
    public void asp(){

    }

}
