# 📂 Classes

## Topics

- [Member Variables](#Member-Variables)
- [Access Modifiers](#Access-Modifiers)
- [Method Declaration](#Method-Declaration)

***

## General

__Anatomy of a class__

```
class MyClass {
  /* field, constructor, & method declarations */
}
```
A simple class declaration requires the `class` keyword, its name, and a body. The body is a block composed of `fields`, `methods`, & `constructors`; altogether, the body provides everything an object of that class needs to manage itself and communicate with other objects. 

* class names are capitalized by default

```
modifiers ClassName extends Superclass implements Interface {
  // statements
}
```
Class declarations may be more complex depending on their responsibility. Classes may have multiple modifiers, may extend from only one `superclass`, and may implement multiple `interfaces`.

* a class can only extend from one parent

* a class may have more than one interface, where multiple interfaces are separated by commas

__Purpose of classes__

Classes provide a means of creating objects which share similar components or behavior. A class object is an instance of the class that defined it.

***

### Member Variables

__Kinds of variables__

There are 3 types of member variables: `fields`, `local variables`, and `parameters`. A `field` is a variable belonging to a class. `Fields` hold data describing an object instance or data the object class requires. A `local variable` is found within a block of code. `Local variables` are used as temporary placeholders relevant to the scope of their code block. Lastly, `parameters` are a type of variable found in a declaration between the parenthesis `()`. `Parameters` pass to a method the data it requires in order to perform its responsibility.

* variable declarations require a type and a name

```
String firstName = "Meg"; // field

// param -> (String name)
String sayHello(String name) {
  String greeting = "Hello "; // local variable
  return greeting + name + "!";
}
```

__Static & Non-Static Fields__

`Fields` may be unique to a specific class object instance or they may be shared among all the objects instantiated of a specific class. A `field` uniquely belonging to an individual object is `non-static` or an `instance variable`. A `field` whose value is shared among all the objects of its class are `static` or `class variables`.

```
static int maxId = 0;
       int counter = 0;
```
Every time `maxId` is changed, the change will affect other object instances of the class. This is one way a class may implement ids for its object instances within itself. When `counter` is changed, the change only pertains to the `counter` field of that specific object instance.

***

### Access Modifiers

__Purpose__

Access modifiers control which variables and methods outside classes may see. The two most common access modifiers are `public` and `private`. `Public` grants access to all other classes while `private` denies direct access to outside classes. `Private` `fields` and `methods` are only accessible within the class, which enforces `encapsulation`. `Private` data may be accessed by using `public methods` in the class called `getters` (get data) and `setters` (set data).

```
private String firstName = "Meg";

public String getFirstName() {
  return firstName;
}
```

***

### Method Declaration

Similar to class declaration, methods don't require much in their simplest form, but more complexity may be added depending on what the method needs to achieve. A method declaration must have a return type, a name, and a body.

```
String greet() {
  // statements
}
```
`String` is the return type of `greet()`. If `greet()` fails to return a `String`, an error results.

```
modifiers return-type methodName(parameter-list) exception-list {
  // body
}
```
Method declarations may include all of the following: multiple modifiers, its return type, its name, a parameter list, an exception list, and its body.

* the method name + its parameter types is called a `method signature`

__Method Overloading__

Methods in a class may have the same name if their method signatures are different, which means their parameter types must be different to allow them to share the same name. `sayName(String name)` is different than `sayName(Person person)` and `getTacos(int amount)` is different than `getTacos(int amount, String type)`.

***

Resources

[The Java Tutorials - Classes]()
