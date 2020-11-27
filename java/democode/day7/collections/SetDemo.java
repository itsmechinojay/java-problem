package com.accenture.democode.day7.collections;

import java.util.HashSet;
import java.util.Set;

/*
Set
- no duplicated
 */
public class SetDemo {

    public static void main(String[] args) {
        Set<String> topics = new HashSet<>();

        topics.add("Collection");
        topics.add("List");
        topics.add("Set");
        topics.add("Set");
        topics.add("Set");
        topics.add("Map");

        System.out.println(topics);
    }
}
