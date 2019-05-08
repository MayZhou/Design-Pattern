package com.mayzhou.dp.creating_pattern.method_factory.example.test;

import com.mayzhou.dp.creating_pattern.method_factory.example.clazz.ReadXML1;
import com.mayzhou.dp.creating_pattern.method_factory.example.i_factory.IFactory;
import com.mayzhou.dp.creating_pattern.method_factory.example.i_product.IProduct;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 07:49
 * @Description:
 * @copyright:
 * @version:
 */
public class AbstractFactoryTest {
    public static void main(String[] args) throws Exception {
        IProduct a;
        IFactory f;
        f = (IFactory) ReadXML1.getObject();
        a = f.newProduct();
        a.show();
    }
}
