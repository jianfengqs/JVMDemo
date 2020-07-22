package com.qs.demo.java2;

/**
 * @Desc: 新生代与老年代中相关参数的设置
 *
 * -Xms600m -Xmx600m
 *
 * -XX:SurvivorRatio：设置新生代中Eden区与Survivor区的比例
 * -XX:NewRatio:设置新生代与老年代的比例。默认是2
 * -XX:-UseAdaptiveSizePolicy：关闭自适应的内存分配（暂时用不到）
 * Xmn:设置新生代的空间大小（一般不设置）
 *
 * @author: jianfeng
 * @Time: 2020/6/30 11:49
 */
public class EdenSurvivorTest {

    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
