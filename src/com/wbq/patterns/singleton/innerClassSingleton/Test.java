package com.wbq.patterns.singleton.innerClassSingleton;

import java.util.stream.IntStream;

/**
 * @program: design_patterns
 * @description: 测试类
 * @author: Mr.Wang
 * @create: 2021-05-13 17:22
 **/
public class Test {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10).forEach(i -> {
            System.out.println(InnerClassSingleton.getInstance());
        });
    }

}
