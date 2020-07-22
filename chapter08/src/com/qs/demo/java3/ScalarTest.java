package com.qs.demo.java3;

/**
 * 标量替换
 *
 * @author jianfeng
 * @date 2020/07/21
 */
public class ScalarTest {

    public static void main(String[] args) {
        alloc();
    }

    private static void alloc() {
        int x = 1;
        int y = 2;
        System.out.println("point.x=" + x + "; point.y=" + y);
    }

    static class Point {
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int x;
        private int y;
    }

}
