package com.wbq.patterns.singleton.enumSingleton;

import java.util.stream.IntStream;

/**
 * @program: design_patterns
 * @description:
 * @author: Mr.Wang
 * @create: 2021-05-13 17:13
 **/
public class Test {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10).forEach(i -> {
            System.out.println(EnumSingleton.getInstance());
        });
    }
}
