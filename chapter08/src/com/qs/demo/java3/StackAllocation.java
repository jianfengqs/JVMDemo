package com.qs.demo.java3;

/**
 * 栈上分配
 * <p>
 * -Xmx1G -Xms1G -XX:-DoEscapeAnalysis（不开启逃逸分析）  -XX:+PrintGCDetails
 * -XX:-DoEscapeAnalysis（开启逃逸分析）
 *
 * @author jianfeng
 * @date 2020/07/21
 */
public class StackAllocation {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        // 查看执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start) + " ms");
        // 为了方便查看堆内存中的对象个数，线程sleep

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void alloc() {
        // 未发生逃逸
        User user = new User();
    }

    static class User {

    }



}
