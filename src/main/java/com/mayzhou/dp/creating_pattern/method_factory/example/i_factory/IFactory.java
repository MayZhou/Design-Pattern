package com.mayzhou.dp.creating_pattern.method_factory.example.i_factory;

import com.mayzhou.dp.creating_pattern.method_factory.example.i_product.IProduct;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 07:29
 * @Description:
 * @copyright:
 * @version:
 */
public interface IFactory {
    public IProduct newProduct();
}
