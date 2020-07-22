package com.qs.demo.java2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:   测试Minor GC、Major GC、Full GC
 *
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 *
 * @author: jianfeng
 * @Time: 2020/7/1 15:37
 */
public class GCTest {

    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "qingshan";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("遍历次数为：" + i);
        }


    }

}
