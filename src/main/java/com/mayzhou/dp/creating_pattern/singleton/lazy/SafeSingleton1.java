package com.mayzhou.dp.creating_pattern.singleton.lazy;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 08:28
 * @Description:
 * @copyright:
 * @version:
 */
public class SafeSingleton1 {
    private static SafeSingleton1 instance;
    private SafeSingleton1(){}
    public static synchronized SafeSingleton1 getInstance(){
        if(instance == null){
            instance = new SafeSingleton1();
        }
        return instance;
    }
}
