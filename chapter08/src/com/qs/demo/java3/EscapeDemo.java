package com.qs.demo.java3;

import com.qs.demo.java2.TestTreeMap;

/**
 * 逃逸分析
 *
 * @author jianfeng
 * @date 2020/07/21
 */
public class EscapeDemo {

    public void myMethod() {
        TestTreeMap testTreeMap = new TestTreeMap();
        // ...
        testTreeMap = null;
    }


//    public static StringBuffer createStringBuffer(String s1, String s2) {
//        StringBuffer sb = new StringBuffer();
//        sb
//                .append(s1)
//                .append(s2);
//        return sb;
//    }

    public static String createStringBuffer(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        sb
                .append(s1)
                .append(s2);
        return sb.toString();
    }

}
