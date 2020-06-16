package com.qs.demo;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/5/7 10:33
 * @Copyright:
 * @Warning:
 */
public class HelloApp {

    /**
     * prepare(准备阶段，赋值默认值)：a=0 --> initial（初始化）：a=1
     * 这里不包含用final修饰的static，因为final在编译的时候就会分配了，准备阶段会显示初始化
     */
    private static int a = 1;

    static {
        a=10;
        b=7;
    }
    private static int b = 2;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }

}
