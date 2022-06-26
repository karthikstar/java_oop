package org.karthikstar.oop_1;

public class Main {
    public static void main(String[] args) {
        // creating an instance of Phone class
//        Phone iPhone = new Phone();


        //define properties
//        iPhone.name = "iphone 11";
//        iPhone.setName("iphone 11"); // we dont have access to the name field directly, but we can access it via the setName method
//        System.out.println(iPhone.getName());
//
//        iPhone.setMemoryRam(8);
//
//         adding behaviours using methods
//        iPhone.playMusic("2chainz");
//        iPhone.playMusic("Swannnn"); //we can reuse this method by passing a different track name

        // m2. when using constructor method,
        // we need to pass values of different propeties at the time of instantiating
//        Phone iPhone = new Phone("iphone 11",5,8,8);
//        System.out.println(iPhone.getName());

//        Phone pixel =  new Phone("Pixel 3", 16);
//        System.out.println(pixel.getName() );


//        INHERITANCE - we have inherited the bird class from the animal class

        // instantiating a Bird
        Bird phoenix = new Bird("Nina", "Golden",2,true, 3);
        // we cna use the getter methods of the parent class Animal
        System.out.println(phoenix.getName());
        phoenix.eat("Meat"); // altered behaviour as we override the existing method defined in the parent class

        System.out.println(phoenix.getWings());
        phoenix.fly(); // this is using the first fly method, as no arguments are passed in
        phoenix.fly(100);
    }
}
