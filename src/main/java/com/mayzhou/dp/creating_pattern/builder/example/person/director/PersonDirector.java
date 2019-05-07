package com.mayzhou.dp.creating_pattern.builder.example.person.director;

import com.mayzhou.dp.creating_pattern.builder.example.person.builderTools.PersonBuilder;
import com.mayzhou.dp.creating_pattern.builder.example.person.model.Person;

/**
 * @Auther: MayZhou
 * @Date: 19/5/7 11:48
 * @Description:
 * @copyright:
 * @version:
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb){
        pb.buildBody();
        pb.buildFoot();
        pb.buildHead();
        return pb.buildPerson();
    }
}
