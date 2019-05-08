package com.mayzhou.dp.creating_pattern.singleton.inner;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 22:25
 * @Description:
 * @copyright:
 * @version:
 */
public class InnerSingleton {

    private InnerSingleton(){}

    private static class InnerObject{
        private static InnerSingleton innerSingleton = new InnerSingleton();

    }

    public static InnerSingleton getInstance(){
        return InnerObject.innerSingleton;
    }
}
