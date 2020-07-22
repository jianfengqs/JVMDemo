package com.qs.demo.java3;

/**
 * 同步省略说明
 *
 * @author jianfeng
 * @date 2020/07/21
 */
public class SynchronizedTest {

    public void f() {
        Object object = new Object();
        synchronized (object) {
            System.out.println(object);
        }
    }

}
