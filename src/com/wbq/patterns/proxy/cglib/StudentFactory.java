package com.wbq.patterns.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName StudentFactory
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 13:10
 * @Version 1.0
 */
public class StudentFactory implements MethodInterceptor {

    private Student student;

    public StudentFactory(Student st) {
        this.student = st;
    }

    public Student getInstanceProxy() {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(Student.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        Student o = (Student) enhancer.create();
        return o;
    }

    /**
     * intercept方法参数说明：
     * o ： 代理对象
     * method ： 真实对象中的方法的Method实例
     * args ： 实际参数
     * methodProxy ：代理对象中的方法的method实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我在前");
        Student o1 = (Student) methodProxy.invokeSuper(o, objects);
        System.out.println("我在后");
        return o1;
    }
}
