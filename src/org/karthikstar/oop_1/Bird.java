package org.karthikstar.oop_1;

public class Bird extends Animal {
    private int wings;

//    default constructor
    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        // animal class doesnt have the field wings
        // hence we are directly setting the value of wings directly in the constructor of Bird class
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
    // we can defining new methods in child class as below
    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

//    another kind of polymoprpshim is with the methods themselves
//    as seen below, compiler is fine with us defining 2 different methods with the same name
    public void fly(int speed) {
        System.out.println(this.getName() + " is flying at speed of "+speed);
    }

    // we can define methods w same name, having diff no of parameters, of taking in different data types as parameters
//    public void fly(String name) {
//
//    }


    // instead of creating new methods, we can change the methods of the parent class
    // override - changing the behavior of the eat method from what is happening inside the parent class
    // super keyword - do whatever u are doing with this paremeter inside the parent class

//    another kind of polymorphism is overriding in child's methods. 2 methods inside a parent and child class doing a job differently
    @Override
    public void eat(String food) {
//        M1: keeping existing functionality and adding additional behavioru
//        super.eat(food);
//        System.out.println("Eating finished");
//    M2: Completely changing the behaviour of the method in the child class
        System.out.println("Chewing "+food);
    }
}








//public class Bird {
//    private String name;
//    private String color;
//    private int legs;
//    private boolean hasTale;
//
//    public Bird(String name, String color, int legs, boolean hasTale) {
//        this.name = name;
//        this.color = color;
//        this.legs = legs;
//        this.hasTale = hasTale;
//    }
//
//    // instead of defining our dog and bird classes like this, we can use inheritance
//    // hence wre create a animal class then extend it to the bird and dog.
//
//    public void eat(String food) {
//        System.out.println("Eating "+ food);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getLegs() {
//        return legs;
//    }
//
//    public void setLegs(int legs) {
//        this.legs = legs;
//    }
//
//    public boolean isHasTale() {
//        return hasTale;
//    }
//
//    public void setHasTale(boolean hasTale) {
//        this.hasTale = hasTale;
//    }
//}



