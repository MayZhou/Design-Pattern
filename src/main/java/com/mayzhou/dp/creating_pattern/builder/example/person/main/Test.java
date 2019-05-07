package com.mayzhou.dp.creating_pattern.builder.example.person.main;

import com.mayzhou.dp.creating_pattern.builder.example.person.builderTools.impl.ManBuilderImpl;
import com.mayzhou.dp.creating_pattern.builder.example.person.director.PersonDirector;
import com.mayzhou.dp.creating_pattern.builder.example.person.model.Person;

/**
 * @Auther: MayZhou
 * @Date: 19/5/7 11:57
 * @Description:
 * @copyright:
 * @version:
 */
public class Test {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilderImpl());
        System.out.println(person.getBody());

    }
}
