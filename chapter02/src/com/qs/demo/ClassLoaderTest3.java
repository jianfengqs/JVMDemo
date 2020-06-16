package com.qs.demo;

import com.sun.net.ssl.internal.ssl.Provider;
import sun.security.ec.CurveDB;

import java.net.URL;


/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/5/7 13:46
 * @Copyright:
 * @Warning:
 */
public class ClassLoaderTest3 {

    public static void main(String[] args) throws ClassNotFoundException {

        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);


        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);

        ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
        System.out.println(parent);

    }

}
