package com.mayzhou.dp.creating_pattern.abstract_factory.example.factory;

import com.mayzhou.dp.creating_pattern.abstract_factory.example.creator.Creator;
import com.mayzhou.dp.creating_pattern.abstract_factory.example.productInterface.ProductA;
import com.mayzhou.dp.creating_pattern.abstract_factory.example.productInterface.ProductB;
import com.mayzhou.dp.creating_pattern.abstract_factory.example.productInterface.impl.ProductA2Impl;
import com.mayzhou.dp.creating_pattern.abstract_factory.example.productInterface.impl.ProductB2Impl;

/**
 * @Auther: MayZhou
 * @Date: 19/5/7 10:19
 * @Description:
 * @copyright:
 * @version:
 */
public class ConcreteCreator2 implements Creator {
    @Override
    public ProductA factoryA() {
        return new ProductA2Impl();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2Impl();
    }
}
