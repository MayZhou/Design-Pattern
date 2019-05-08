package com.mayzhou.dp.structural_pattern.adapter.instance;

import com.mayzhou.dp.structural_pattern.adapter.clazz.be_adapter.Adapter;
import com.mayzhou.dp.structural_pattern.adapter.clazz.i_target.ITarget;

/**
 * @Auther: MayZhou
 * @Date: 19/5/8 23:09
 * @Description:
 * @copyright:
 * @version:
 */
public class InstanceAdapter implements ITarget {
    private Adapter adapter;

    public InstanceAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void request() {
        adapter.specificRequest();
    }
}
