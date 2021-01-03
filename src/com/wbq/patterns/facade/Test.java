package com.wbq.patterns.facade;

/**
 * @ClassName Test
 * @Description 外观者模式测试
 * @Author wbq
 * @Date 2021/1/2 17:49
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.say("打开");
        facade.say("关闭");
    }
}
