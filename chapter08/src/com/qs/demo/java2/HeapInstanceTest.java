package com.qs.demo.java2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Desc:
 *
 *
 * -Xms600m -Xmx600m
 *
 * @author: jianfeng
 * @Time: 2020/7/1 10:32
 */
public class HeapInstanceTest {

    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
