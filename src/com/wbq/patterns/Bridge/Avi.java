package com.wbq.patterns.Bridge;

/**
 * @ClassName Avi
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 17:02
 * @Version 1.0
 */
public class Avi implements VedioFile {
    @Override
    public void decode() {
        System.out.println("Avi格式文件");
    }
}
