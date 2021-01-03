package com.wbq.patterns.singleton.reflect;

import com.wbq.patterns.singleton.villain1.Villain;
import com.wbq.patterns.singleton.villain2.Villain2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ReflectSingletonTest
 * @Description �����ƻ���������
 * @Author wbq
 * @Date 2021/1/1 18:10
 * @Version 1.0
 */
public class ReflectSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //��ȡ�����
        Class<Villain2> villainClass = Villain2.class;
//        Villain.getClass();
//        Class<Villain> aClass = Class.forName("com.wbq.patterns.singleton.villain1.Villain");
        Constructor<Villain2> declaredConstructor = villainClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Villain2 villain1 = Villain2.getInstance();
        System.out.println(villain1);
        Villain2 villain = declaredConstructor.newInstance();
        System.out.println(villain);
        System.out.println(villain == villain1);
    }
}
