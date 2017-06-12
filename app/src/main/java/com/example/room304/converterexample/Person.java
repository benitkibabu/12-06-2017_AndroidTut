package com.example.room304.converterexample;

import java.io.Serializable;

/**
 * Created by room3.04 on 12/06/2017.
 */
public class Person implements Serializable {
    String name;
    int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
