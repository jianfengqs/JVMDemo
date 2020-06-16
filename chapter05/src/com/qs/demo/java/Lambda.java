package com.qs.demo.java;

/**
 * @Desc:   体会invokedynamic指令
 * @author: jianfeng
 * @Time: 2020/6/12 10:04
 */
interface Func{
    boolean func(String str);
}
public class Lambda {
    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        Lambda lambda=new Lambda();
        Func func=s->{
            return true;
        };

        lambda.lambda(func);

        lambda.lambda(str -> {
            return true;
        });

    }
}
