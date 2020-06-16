package com.qs.demo;

/**
 * @Desc:   栈帧的执行顺序
 * @author: jianfeng
 * @Time: 2020/6/2 10:30
 *
 * 方法的结束方式分为两种：1、正常结束，以return为代表
 *                     2、方法执行中出现未捕获处理的异常，以抛出异常的方式结束
 *
 */
public class StackFrameTest {

    public static void main(String[] args) {
        StackFrameTest test=new StackFrameTest();
        test.method1();

    }

    public void method1(){
        System.out.println("menthod1()开始执行。。。");
        menthod2();
        System.out.println("menthod1()执行结束。。。");
    }

    public int menthod2() {
        System.out.println("menthod2()开始执行。。。");
        int i=10;
        int m=(int) menthod3();
        System.out.println("menthod2()即将结束。。。");
        return i+m;
    }

    public double menthod3() {
        System.out.println("menthod3()开始执行。。。");
        double j=20.0;
        System.out.println("menthod3()即将结束。。。");
        return j;
    }

}
