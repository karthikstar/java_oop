package org.karthikstar.oop_1;

public class Animal {
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;
//    Concept: Polymorphism - means different forms
//    One kind of polymorphism is for a class to have mutiple constructors
    public Animal(String name, String color, int legs, boolean hasTale) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTale = hasTale;
    }

//   below is another kind of constructor. we can now create animal class in 2 different ways.
//    public Animal(String name, String color, int legs) {
//        this.name = name;
//        this.color = color;
//        this.legs = legs;
//    }

    public void eat(String food) {
        System.out.println("Eating "+food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }
}
