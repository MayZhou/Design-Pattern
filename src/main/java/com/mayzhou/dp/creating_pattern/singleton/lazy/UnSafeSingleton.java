package com.mayzhou.dp.creating_pattern.singleton.lazy;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 08:25
 * @Description:
 * @copyright:
 * @version:
 */
public class UnSafeSingleton {
    private static UnSafeSingleton instance;
    private UnSafeSingleton(){}
    public static UnSafeSingleton getInstance(){
        if (instance == null ){
            instance = new UnSafeSingleton();
        }
        return instance;
    }
}
