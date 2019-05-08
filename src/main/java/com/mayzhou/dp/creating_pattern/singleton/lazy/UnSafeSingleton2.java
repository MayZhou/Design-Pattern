package com.mayzhou.dp.creating_pattern.singleton.lazy;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 08:31
 * @Description:
 * @copyright:
 * @version:
 */
public class UnSafeSingleton2 {
    private static UnSafeSingleton2 instance;
    private UnSafeSingleton2(){}
    public static UnSafeSingleton2 getInstance(){
        if(instance == null){
            synchronized (UnSafeSingleton2.class){
                instance = new UnSafeSingleton2();
            }
        }
        return instance;
    }
}
