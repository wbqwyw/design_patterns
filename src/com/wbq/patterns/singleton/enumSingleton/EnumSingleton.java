package com.wbq.patterns.singleton.enumSingleton;

/**
 * @program: design_patterns
 * @description: 枚举类实现单例模式
 * @author: Mr.Wang
 * @create: 2021-05-13 16:59
 **/
public class EnumSingleton {

    private EnumSingleton() {
    }

    private enum single {
        sin;
        private final EnumSingleton enumSingleton;

        single() {
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return enumSingleton;
        }
    }

    public static EnumSingleton getInstance() {
        return single.sin.enumSingleton;
    }
}
