package com.mayzhou.dp.creating_pattern.singleton.lazy;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 08:20
 * @Description:
 * @copyright:
 * @version:
 */
public class LazySingleton1 {
    private final static LazySingleton1 INSTANCE = new LazySingleton1();
    private LazySingleton1(){}
    public static LazySingleton1 getInstance(){
        return INSTANCE;
    }
}
