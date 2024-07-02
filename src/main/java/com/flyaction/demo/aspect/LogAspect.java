package com.flyaction.demo.aspect;


import com.flyaction.demo.annotation.LogAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Aspect
@Component
public class LogAspect {


    @Pointcut("@annotation(com.flyaction.demo.annotation.LogAnnotation)")
    public void logPointCut(){}

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {

        String name = point.getSignature().getName();

        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        LogAnnotation annotation = method.getAnnotation(LogAnnotation.class);


        if(annotation != null){
            String value = annotation.value();
            System.out.println("【系统日志】当前操作："+value+",调用了"+name+"方法,返回值是："+point.proceed());
        }


        return point.proceed();

    }
}
