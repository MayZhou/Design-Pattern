package com.mayzhou.dp.creating_pattern.method_factory.example.i_product.impl;

import com.mayzhou.dp.creating_pattern.method_factory.example.i_product.IProduct;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 07:28
 * @Description:
 * @copyright:
 * @version:
 */
public class ConcreteProduct2 implements IProduct {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
