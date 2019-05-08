package com.mayzhou.dp.structural_pattern.adapter.clazz.i_target.impl;

import com.mayzhou.dp.structural_pattern.adapter.clazz.be_adapter.Adapter;
import com.mayzhou.dp.structural_pattern.adapter.clazz.i_target.ITarget;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 23:05
 * @Description:
 * @copyright:
 * @version:
 */
public class ClassAdapter extends Adapter implements ITarget {
    @Override
    public void request() {
        specificRequest();
    }
}
