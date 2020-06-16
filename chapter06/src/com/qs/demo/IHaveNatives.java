package com.qs.demo;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/6/12 19:35
 */
public class IHaveNatives {

    public native void native1(int x);

    public native static long natvie2();

    private native synchronized float native3(Object obj);

    native void native4(int[] array) throws Exception;

}
