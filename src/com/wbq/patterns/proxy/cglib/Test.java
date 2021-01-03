package com.wbq.patterns.proxy.cglib;

/**
 * @ClassName Test
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 13:15
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory(new Student());
        Student student = studentFactory.getInstanceProxy();
        student.print("ÎÒ¿ì¿¼ÊÔ");
    }

}
