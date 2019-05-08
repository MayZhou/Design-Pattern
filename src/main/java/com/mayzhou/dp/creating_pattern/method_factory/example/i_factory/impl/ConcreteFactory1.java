package com.mayzhou.dp.creating_pattern.method_factory.example.i_factory.impl;

import com.mayzhou.dp.creating_pattern.method_factory.example.i_factory.IFactory;
import com.mayzhou.dp.creating_pattern.method_factory.example.i_product.IProduct;
import com.mayzhou.dp.creating_pattern.method_factory.example.i_product.impl.ConcreteProduct1;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 07:33
 * @Description:
 * @copyright:
 * @version:
 */
public class ConcreteFactory1 implements IFactory {
    @Override
    public IProduct newProduct() {
        return new ConcreteProduct1();
    }
}
