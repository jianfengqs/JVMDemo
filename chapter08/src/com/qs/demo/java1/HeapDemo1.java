package com.qs.demo.java1;

/**
 * @Desc:
 *
 *  -Xms10m
 *  -Xmx10m
 *
 * @author: jianfeng
 * @Time: 2020/6/15 17:46
 */
public class HeapDemo1 {

    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");

    }

}
