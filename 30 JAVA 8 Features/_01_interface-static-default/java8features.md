## JAVA 8 Features

### JAVA 8 : default & static Methods in interface

1. what is default and static methods in interface
   <br/>
2. Importance of default methods in interfaces
   <br/>
3. What is Backward Compatibility with default Methods
   <br/>
4. Use cases of default methods.
   <br/>
5. importance of static method in interfaces
   <br/>
6. difference between default and static methods
   <br/>
7. Predefined default/static methods from interfaces

````## JAVA 8 Features

### JAVA 8: default & static Methods in interface

1. What is default and static methods in interface

   * Default Methods: methods with body inside interface using `default` keyword; can be inherited or overridden.
   * Static Methods: methods with `static` keyword; belong to interface, called via interface name.

2. Importance of default methods in interfaces

   * Add new methods to interface without breaking existing implementations.
   * Reduce boilerplate code.

3. Backward Compatibility with default Methods

   * Before Java 8, adding a method to interface breaks all implementing classes.
   * Default methods provide body, keeping backward compatibility.

4. Use cases of default methods

   * Provide common behavior like logging, utility functions.
   * Multiple interface inheritance.

5. Importance of static methods in interfaces

   * Utility/helper methods related to interface.
   * Cannot be overridden.
   * Called using interface name.

6. Difference between default and static methods

| Feature     | Default Method  | Static Method   |
| ----------- | --------------- | --------------- |
| Declaration | default keyword | static keyword  |
| Called on   | Object of class | Interface name  |
| Overridable | Yes             | No              |
| Inheritance | Yes             | No              |
| Use Case    | Common behavior | Utility methods |

7. Predefined default/static methods from interfaces

   * `List.forEach()`, `Map.getOrDefault()` → default methods
   * `Collections.sort()`, `Stream.of()`, `Comparator.comparing()` → static methods

---

### Syntax Evolution

Until Java 7:

```java
interface MyInterface {
    // only abstract methods
}
````

Java 8 onwards:

```java
interface MyInterface {
    // abstract methods
    // default methods
    // static methods
}
```

---

### Interfaces and Classes with Explanations

#### InterfaceOne.java

```java
public interface InterfaceOne {
    void printNames();
    String getNames();

    default void deafultMethodOne() {
        System.out.println("Inside Default Method One..");
    }

    default String deafultMethodTwo() {
        System.out.println("Inside Default Method Two..");
        return "deafultMethodTwo";
    }

    default void defaultMethodFive() {
        System.out.println("Inside InterfaceOne: defaultMethodFive");
    }

    static String staticMethodOne() {
        System.out.println("This is static methodOne");
        return "This is static method";
    }

    static void staticMethodTwo() {
        System.out.println("This is static Method Two");
    }
}
```

#### InterfaceTwo.java

```java
public interface InterfaceTwo {
    default void defaultMethoThree() {
        System.out.println("Inside InterfaceTwo: defaultMethodThree...");
    }

    default void defaultMethodFive() {
        System.out.println("Inside InterfaceTwo: defaultMethodFive");
    }
}
```

#### ClassOne.java

```java
public class ClassOne implements InterfaceOne {
    @Override
    public void printNames() {
        System.out.println("Printing names");
    }

    @Override
    public String getNames() {
        System.out.println("getting names");
        return "default Method";
    }

    @Override
    public void deafultMethodOne() {
        System.out.println("ClassOne overrides defaultMethodOne from InterfaceOne");
    }
}
```

#### ClassTwo.java

```java
public class ClassTwo implements InterfaceOne {
    @Override
    public void printNames() {
       System.out.println("in classTwo: printNames");
    }

    @Override
    public String getNames() {
        System.out.println("Getting names in ClassTwo");
        return null;
    }
}
```

#### ClassThree.java

```java
public class ClassThree implements InterfaceOne, InterfaceTwo {
    @Override
    public void printNames() {}

    @Override
    public String getNames() { return null; }

    @Override
    public void defaultMethodFive() {
        InterfaceOne.super.defaultMethodFive();
        InterfaceTwo.super.defaultMethodFive();
    }
}
```

#### ClassFour.java

```java
public class ClassFour implements InterfaceOne {
    @Override
    public void printNames() {
        System.out.println("This is ClassFour: printNames");
    }

    @Override
    public String getNames() {
        System.out.println("This is ClassFour: getNames");
        return "This is ClassFour: getNames";
    }
}
```

#### TestingDefaultMethods.java

```java
public class TestingDefaultMethods {
    public static void main(String args[]) {
        ClassOne one = new ClassOne();
        one.deafultMethodOne();
        one.deafultMethodTwo();
        one.printNames();
        one.getNames();

        ClassTwo two = new ClassTwo();
        two.deafultMethodOne();
        two.deafultMethodTwo();
        two.printNames();
        two.getNames();

        ClassThree three = new ClassThree();
        three.defaultMethodFive();
        three.defaultMethoThree();

        InterfaceOne.staticMethodOne();
        InterfaceOne.staticMethodTwo();
    }
}
```

**Expected Output:**

```
Inside Default Method One..
Inside Default Method Two..
Printing names
getting names
Inside Default Method One..
Inside Default Method Two..
in classTwo: printNames
Getting names in ClassTwo
Inside InterfaceOne: defaultMethodFive
Inside InterfaceTwo: defaultMethodFive
Inside InterfaceTwo: defaultMethodThree...
This is static methodOne
This is static Method Two
```

---

This markdown file contains:

- Explanation points
- Syntax evolution
- All interfaces and classes
- Test class and expected output

```
until java 7,
interface {
  // only abstract method
}
```

```
java 8 onwards
interface {
  //abstract methods
  //default methods
  // static methods
}
```

### Functional Interface & Lambda Expressions:

1. What is Functional Interface

- An interface which contains Only one abstract Methods
- 1: abstract Method :only 1 abstract method
- N: default method
- N: static methods
- SAM: single abstract method

```
interface
  @FunctionalInterface
  One{
  m1();
  m2(); // compile time error
  }

  @FunctionalInterface
  One{
  }// compile time error


  @FunctionalInterface
  One{
   m1();
  }

```

  <br/>

2. Importance and Implementation of Functional Interface
   <br/>
3. What is Lambda Expression

- single Functionality implementation
  -Implementing Single Abstract method of functional interface and we are creating an instance of an implementation

Syntaxes:

1. Method with parameter >1
   (parameter names)->{
   code block
   };

2. Method with No parameters=0  
   ()->{
   code block
   }
   <br/>
3. Relation Between Functional Interface and Lambda Expressions
   <br/>
4. What is Functional Programming
   <br/>
5. What is declarative Programming
