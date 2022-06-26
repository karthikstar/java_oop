package org.karthikstar.oop_1;

public class Shepherd extends Dog {
//    even though inside the dog we dont have any field, inside the shepherd class we need all the fields, as
//    the parent of the shepherd class, which is the dog class, is the child of another class, which is Animal
    public Shepherd(String name, String color, int legs, boolean hasTale) {
        super(name, color, legs, hasTale);
    }

}
