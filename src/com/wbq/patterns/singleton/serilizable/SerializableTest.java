package com.wbq.patterns.singleton.serilizable;

import com.wbq.patterns.singleton.lazy4.Lazy4;

import java.io.*;

/**
 * @ClassName SerializableTest
 * @Description 序列化反序列化破坏单例测试
 * @Author wbq
 * @Date 2021/1/1 17:31
 * @Version 1.0
 */
public class SerializableTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"))
        ) {

            oos.writeObject(Lazy4.getInstance());
            Lazy4 o = (Lazy4) ois.readObject();
            Lazy4 lazy4 = Lazy4.getInstance();
            System.out.println(o);
            System.out.println(lazy4);
            System.out.println(lazy4 == o);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
