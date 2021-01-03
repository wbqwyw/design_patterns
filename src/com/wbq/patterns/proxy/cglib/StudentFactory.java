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
        //����Enhancer����������JDK��̬�����Proxy�࣬��һ���������ü�������
        Enhancer enhancer = new Enhancer();
        //���ø�����ֽ������
        enhancer.setSuperclass(Student.class);
        //���ûص�����
        enhancer.setCallback(this);
        //�����������
        Student o = (Student) enhancer.create();
        return o;
    }

    /**
     * intercept��������˵����
     * o �� �������
     * method �� ��ʵ�����еķ�����Methodʵ��
     * args �� ʵ�ʲ���
     * methodProxy ����������еķ�����methodʵ��
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("����ǰ");
        Student o1 = (Student) methodProxy.invokeSuper(o, objects);
        System.out.println("���ں�");
        return o1;
    }
}
