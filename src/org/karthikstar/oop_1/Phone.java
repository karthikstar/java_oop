package org.karthikstar.oop_1;

public class Phone {
    // adding some properties to this class
    private String name;
    private int screenSize;
    private int memoryRam;
    private int camera;

    //creating a constructor

    // this is called a constructor. constructor must have public as its access modifier, and must return Phone, the exact item we are in
    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    // our class can have multiple constructurs
    // having 2 different kinds of consturctors for a class is called polymorphism
    // this constructur only takes in name and memory ram
    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }

    //if we use private - means the method is only accessible from our class and not from outside our class
    // public, private, protected - these are access modifiers - can have them for our methods, classes or even fields of classes
    public void playMusic (String trackName) {
        // void keyword means this method will return nth
        System.out.println("Playing "+trackName);
    }

    // we can create public methods to modify private property of this class called name
    // by default access modifier is set to public, so we dont even need to use that keyword
    // public - means this field can be accessible from other classes

    // we can easily get setters and getters by right clicking generate button
    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name; //this refers to the current object
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }
}
