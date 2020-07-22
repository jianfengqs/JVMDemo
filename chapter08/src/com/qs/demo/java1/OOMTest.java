package com.qs.demo.java1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Desc: OOM示例
 * <p>
 * -Xms600m     -Xmx600m
 * @author: jianfeng
 * @Time: 2020/6/29 17:40
 */
public class OOMTest {

    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }

    }

}

class Picture {

    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }

}
