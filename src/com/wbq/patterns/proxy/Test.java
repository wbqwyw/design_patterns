package com.wbq.patterns.proxy;

/**
 * @ClassName Test
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 12:17
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        StudentHandle sh = new StudentHandle(student);
        StudentProxy sp = new StudentProxy(sh);
        Man man = sp.getInstance();
        man.print("ÄãºÃ");
    }
}
