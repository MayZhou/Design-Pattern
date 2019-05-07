package com.mayzhou.dp.creating_pattern.builder.example.person.builderTools.impl;

import com.mayzhou.dp.creating_pattern.builder.example.person.builderTools.PersonBuilder;
import com.mayzhou.dp.creating_pattern.builder.example.person.model.Person;

/**
 * @Auther: MayZhou
 * @Date: 19/5/7 11:40
 * @Description:
 * @copyright:
 * @version:
 */
public class ManBuilderImpl implements PersonBuilder {
    Person person;
    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    public ManBuilderImpl() {
        person = new Person();
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
