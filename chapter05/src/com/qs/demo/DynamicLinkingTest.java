package com.qs.demo;

/**
 * @Desc:   动态链接
 * @author: jianfeng
 * @Time: 2020/6/4 17:41
 */
public class DynamicLinkingTest {

    int num=10;

    public void methodA(){
        System.out.println("methodA()....");
    }

    public void methodB(){
        System.out.println("methodB()....");

        methodA();

        num++;
    }

}
