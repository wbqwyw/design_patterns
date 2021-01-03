package com.wbq.patterns.Bridge;

/**
 * @ClassName Test
 * @Description «≈Ω”ƒ£ Ω≤‚ ‘
 * @Author wbq
 * @Date 2021/1/2 17:09
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        OsSystem os = new WindowsSystem(new Avi());
        os.play();
        OsSystem os1 = new MacSystem(new Avi());
        os1.play();
        OsSystem os2 = new MacSystem(new Rmvb());
        os2.play();
    }
}
