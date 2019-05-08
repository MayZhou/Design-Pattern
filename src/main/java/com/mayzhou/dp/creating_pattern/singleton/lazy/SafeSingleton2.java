package com.mayzhou.dp.creating_pattern.singleton.lazy;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 22:18
 * @Description:
 * @copyright:
 * @version:
 */
public class SafeSingleton2 {
    private static volatile SafeSingleton2 safeSingleton2;

    private SafeSingleton2() {
    }
    public static SafeSingleton2 getInstance(){
        if (safeSingleton2 == null){
            synchronized (SafeSingleton2.class){
                if (safeSingleton2 == null){
                    safeSingleton2 = new SafeSingleton2();
                }
            }
        }
        return safeSingleton2;
    }
}
