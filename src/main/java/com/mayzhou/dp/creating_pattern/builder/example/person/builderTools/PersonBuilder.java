package com.mayzhou.dp.creating_pattern.builder.example.person.builderTools;

import com.mayzhou.dp.creating_pattern.builder.example.person.model.Person;

/**
 * @Auther: MayZhou
 * @Date: 19/5/7 11:34
 * @Description:
 * @copyright:
 * @version:
 */
public interface PersonBuilder {
    public void buildHead();
    public void buildBody();
    public void buildFoot();
    public Person buildPerson();
}
