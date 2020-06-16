package com.qs.demo;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/5/7 11:54
 * @Copyright:
 * @Warning:
 */
public class ClinitTest {

    // 任何一个类声明以后，内部至少存在一个类得构造器
    private int a=1;
    private static int c=3;


    public static void main(String[] args) {
        int b=2;
    }

    public ClinitTest() {
        a=10;
        int d=20;
    }


}
