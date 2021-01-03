package com.wbq.patterns.Bridge;

/**
 * @ClassName WindowsSystem
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 17:06
 * @Version 1.0
 */
public class WindowsSystem extends OsSystem {
    public WindowsSystem(VedioFile vedioFile) {
        super(vedioFile);
    }

    @Override
    public void play() {
        System.out.print("Window∆ΩÃ®≤•∑≈£∫");
        getVedioFile().decode();
    }
}
