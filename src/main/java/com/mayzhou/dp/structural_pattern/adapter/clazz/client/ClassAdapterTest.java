package com.mayzhou.dp.structural_pattern.adapter.clazz.client;

import com.mayzhou.dp.structural_pattern.adapter.clazz.be_adapter.Adapter;
import com.mayzhou.dp.structural_pattern.adapter.clazz.i_target.ITarget;
import com.mayzhou.dp.structural_pattern.adapter.clazz.i_target.impl.ClassAdapter;
import com.mayzhou.dp.structural_pattern.adapter.instance.InstanceAdapter;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 23:07
 * @Description:
 * @copyright:
 * @version:
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        ITarget iTarget = new ClassAdapter();
        ITarget iTarget1 = new InstanceAdapter(new Adapter());
                iTarget.request();
                iTarget1.request();
    }
}
