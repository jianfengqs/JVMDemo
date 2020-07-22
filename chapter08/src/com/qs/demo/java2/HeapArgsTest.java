package com.qs.demo.java2;

/**
 * @Desc:   测试堆空间常用的JVM参数
 *
 * -XX:+PrintFlagsInitial:查看所有的参数的默认初始值
 * -XX:+PrintFlagsFinal:查看所有的参数最终值（可能会存在修改，不再是初始值）
 *      具体查看某个参数的指令：jsp指令：查看当前运行中的进程
 *                          jinfo -flag SurvivorRatio   进程id
 *
 * -Xms:初始堆空间内存（默认为物理内存的1/64）
 * -Xmx:最大堆空间内存（默认为物理内存的1/4）
 * -Xmn:设置新生代的大小（初始值及最大值）
 * -XX:NewRatio:配置新生代与老年代在堆空间的占比
 * -XX:SurvivorRatio:设置新生代中Eden区和S0/S1区空间的比例
 * -XX:MaxTenuringThreshold:设置新生代垃圾的最大年龄
 * -XX:+PrintGCDetails:输出详细的GC处理日志
 * 打印GC简要信息：
 * （1）-XX:+PrintGC
 * （2）-verbose:gc
 * -XX:HandlePromotionFailure:是否设置空间分配担保
 *
 * @author: jianfeng
 * @Time: 2020/7/8 16:01
 */
public class HeapArgsTest {

    public static void main(String[] args) {

    }

}
