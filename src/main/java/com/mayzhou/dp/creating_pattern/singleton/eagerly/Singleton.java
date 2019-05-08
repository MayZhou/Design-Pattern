package com.mayzhou.dp.creating_pattern.singleton.eagerly;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 22:22
 * @Description:
 * @copyright:
 * @version:
 */
public class Singleton {
    private Singleton(){}

    private static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
}
