package com.mayzhou.dp.creating_pattern.singleton.lazy;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 08:22
 * @Description:
 * @copyright:
 * @version:
 */
public class LazySingleton2 {
    private static LazySingleton2 lazySingleton2;
    static {
        lazySingleton2 = new LazySingleton2();
    }
    private LazySingleton2(){

    }

    public static LazySingleton2 getInstance(){
        return lazySingleton2;
    }
}
