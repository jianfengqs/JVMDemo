package com.qs.demo.java2;

/**
 * @Desc:
 *
 * 面试题：
 * 方法中定义的局部变量是否是线程安全？具体问题具体分析
 *
 *      何为线程安全？
 *          如果只有一个线程才可以操作此数据，则是线程安全的。
 *          如果有多个线程操作此数据，则此数据是共享数据。如果不考虑同步机制的话，则会存在线程安全问题。
 *
 * @author: jianfeng
 * @Time: 2020/6/12 16:45
 */
public class StringBuilderTest {

    /**
     * @Desc:  s1局部变量声明方式是线程安全的
     * @author: jianfeng
     * @Time: 2020/6/12 16:48
     * @return void
     */
    public static void method1(){

        StringBuilder s1=new StringBuilder();
        s1
                .append("a")
                .append("b");
        // ...
    }

    /**
     * @Desc:  s2的操作过程：有可能存在线程安全问题
     * @author: jianfeng
     * @Time: 2020/6/12 16:53
     * @param s2
     * @return void
     */
    public static void method2(StringBuilder s2){
        s2
                .append("a")
                .append("b");
        // ...
    }

    /**
     * @Desc:  s3的操作有可能存在线程安全问题，因为把变量返回出去了
     * @author: jianfeng
     * @Time: 2020/6/12 16:59
     * @return java.lang.StringBuilder
     */
    public static StringBuilder method3(){
        StringBuilder s3=new StringBuilder();
        s3
                .append("a")
                .append("b");
        return s3;
    }

    /**
     * @Desc:  s4是线程安全的，因为我们在方法内部声明的是StringBuilder，
     * 返回的时候转成了String，相当于s4（StringBuilder）消亡了，
     * 但是我们返回的String可能会被多个线程调用，所以是线程不安全的
     *
     * @author: jianfeng
     * @Time: 2020/6/12 17:01
     * @return java.lang.String
     */
    public static String method4(){
        StringBuilder s4=new StringBuilder();
        s4
                .append("a")
                .append("b");
        return s4.toString();
    }

    /**
     * main方法会存在并发
     */
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();

        new Thread(()->{
            s
                    .append("a")
                    .append("b");
        }).start();

        method2(s);

    }


}
