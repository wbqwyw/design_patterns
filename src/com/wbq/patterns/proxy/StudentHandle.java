package com.wbq.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName StudentProxy
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 12:07
 * @Version 1.0
 */
public class StudentHandle implements InvocationHandler {

    private Student student;

    public StudentHandle(Student student) {
        this.student = student;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Ç°×à");
        Object res = method.invoke(student, args);
        System.out.println("ºóÐø");
        return res;
    }
}
