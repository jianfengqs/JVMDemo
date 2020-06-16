package com.qs.demo;

/**
 * @Desc: 演示栈中异常：StackOverflowError
 * @author: jianfeng
 * @Time: 2020/5/9 10:30
 * 默认情况下：count：11405
 * 设置栈的大小：-Xss256K   count：2458
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }


}
