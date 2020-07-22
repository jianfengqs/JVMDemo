package com.qs.demo.java3;

/**
 * 标量替换测试
 * <p>
 * -Xmx100m -Xms100m -XX:+DoEscapeAnalysis（默认开启逃逸分析）  -XX:+PrintGC  -XX:+EliminateAllocations（开启标量替换）
 *
 * @author jianfeng
 * @date 2020/07/22
 */
public class ScalarReplace {

    public static class User {
        public int id;
        public String name;
    }

    public static void alloc() {
        // 未发生逃逸
        User user = new User();
        user.id = 5;
        user.name = "张三";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        // 查看执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start) + " ms");

    }

}
