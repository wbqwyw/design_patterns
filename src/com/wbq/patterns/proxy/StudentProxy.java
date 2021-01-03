package com.wbq.patterns.proxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName StudentProxy
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 12:10
 * @Version 1.0
 */
public class StudentProxy {
    private StudentHandle studentHandle;

    public StudentProxy(StudentHandle sh) {
        this.studentHandle = sh;
    }

    public Man getInstance() {
        Man o = (Man) Proxy.newProxyInstance(Student.class.getClassLoader(), Student.class.getInterfaces(), studentHandle);
        return o;
    }
}
