package com.williamsonmegan;

public class Main {

    public static void main(String[] args) {

        // instantiate an object of MyClass to use it
        // new calls the appropriate constructor signature to create a new object
        MyClass myClass = new MyClass();

        System.out.println("\n****** Method overriding ******");
        // calling sayHello on myClass with a parameter and without is legal because
        // there is method overloading happening
        System.out.println("myClass.sayHello without params: " + myClass.sayHello());
        System.out.println("myClass.sayHello with params: " + myClass.sayHello("Megan"));

        System.out.println("\n****** Using getter to access private field ******");
        // calling firstName will cause an error because it is set as private
        // System.out.println(myClass.firstName);
        // calling a getter for firstName will not cause an error because getFirstName
        // has access to fields within the class
        System.out.println("myClass.getFirstName(): " + myClass.getFirstName());

        System.out.println("\n****** Using static id field to generate non-static ids for object instances ****** ");
        // prints 1
        // uses static maxId to self-generate ids for each object
        // then sets each object's myMaxId value to the next id
        System.out.println("myClass.getMyMaxId(): " + myClass.getMyMaxId());
        MyClass myClass2 = new MyClass();
        // prints 2
        System.out.println("myClass2.getMyMaxId(): " + myClass2.getMyMaxId());

        System.out.println("\n****** Constructor overriding ******");
        // new calls alternative constructor which takes in a firstName argument
        MyClass myClass3 =  new MyClass("Robert");
        System.out.println("myClass3.getFirstName(): " +myClass3.getFirstName());
        System.out.println("myClass3.getMyMaxId(): " + myClass3.getMyMaxId());
        System.out.println("myClass3.sayHello(): " + myClass3.sayHello());
        System.out.println("myClass3.sayHello(\"Meg\"): " + myClass3.sayHello("Meg"));

        System.out.println("\n****** Instantiate object without constructor or superclass ******");
        // creating an object without a default constructor and no superclass
        // NoConstructorClass calls a default no-arg constructor which calls Object's no-arg constructor
        // because there is no superclass
        NoConstrutorClass noConstrutorClassObj = new NoConstrutorClass();
        System.out.println("noConstructorClassObj.getGreeting(): " + noConstrutorClassObj.getGreeting()); // null

        System.out.println("\n****** Instantiate object without constructor with superclass");
        // creating an object without a default constructor but does have superclass
        ClassB classBObj = new ClassB();
        // creating object of superclass
        ClassA classAObj = new ClassA();
        System.out.println("classBObj.getGreeting(): " + classBObj.getGreeting()); // hello
        System.out.println(" * Use setGreeting to update classBObj's greeting to \"hi there\" *");
        classBObj.setGreeting("hi there");
        System.out.println("classBObj.getGreeting(): " + classBObj.getGreeting()); // hi there
        System.out.println("classAObj.getGreeting(): " + classAObj.getGreeting()); // hello
    }
}
