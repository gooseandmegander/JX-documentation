package com.williamsonmegan;

// class declarations require the class keyword, class name, and body.
// Modifiers like public and private are optional, but the default is public
// class names are capitalized

// class declarations may have modifiers, extend one class, or implement multiple interfaces

public class MyClass {

    // fields, method declarations, and constructors

    // fields are variables which belong to a class
    // it is common to make fields private to encourage encapsulation
    private String firstName = "Meg";

    // static fields are variables shared among all the class' instantiated objects
    // for example, if there were two objects of MyClass, obj1 and obj2, they both have maxId as a field,
    // and the value of maxId is shared among both of them.
    private static int maxId = 0;

    // obj1 and obj2 both have myMaxId fields, but the value is dependent on that individual object
    private int myMaxId;

    // constructors are called to create new objects of their respective class
    // more than one constructor is allowed as long as their parameter list is different
    public MyClass() {
        maxId++;
        myMaxId = maxId;
    }

    public MyClass(String firstName) {
        this.firstName = firstName;
        maxId++;
        myMaxId = maxId;
    }

    // variables between the parenthesis are part of the parameter list and are called parameters
    String sayHello(String name) {
        String greeting = "Hello "; // local variable - as in local to this method
        return greeting + name + "!";
    }

    // having more than one method of the same name with different method signatures is method overloading
    // the compiler can differentiate which one to choose as long as their signatures or parameter lists are different
    String sayHello() {
        String greeting = "Hello "; // local variable - as in local to this method
        return greeting + firstName + "!";
    }

    public String getFirstName() {
        return firstName;
    }

    public int getMyMaxId() {
        return myMaxId;
    }
}
