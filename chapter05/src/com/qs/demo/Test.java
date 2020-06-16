package com.qs.demo;

import java.util.Date;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/5/9 14:19
 * @Copyright:
 * @Warning:
 */
public class Test {

    private int count=10;

    public Test(int count) {
        this.count = count;
    }

    public static void main(String[] args) {


    }

    public static void testStatic() {
//        Test test = new Test();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
    }

    public void test1(){
        Date date=new Date();
        String name="qs";
        int i = 0;
        System.out.println(i);

    }

    public void test4() {
        this.count ++;
    }

    public void test2(){
        int a=0;

        {
            int b=0;
            b=a+1;
        }
        int c=a+1;

    }

    public void test5(){
        int num = 0;
        System.out.println(num);
    }


}
