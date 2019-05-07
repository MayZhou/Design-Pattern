package com.mayzhou.dp.creating_pattern.abstract_factory.example.creator;

import com.mayzhou.dp.creating_pattern.abstract_factory.example.productInterface.ProductA;
import com.mayzhou.dp.creating_pattern.abstract_factory.example.productInterface.ProductB;

/**
 * @Auther: MayZhou
 * @Date: 19/5/7 09:59
 * @Description:
 * @copyright:
 * @version:
 */
public interface Creator {
    public ProductA factoryA();
    public ProductB factoryB();
}
