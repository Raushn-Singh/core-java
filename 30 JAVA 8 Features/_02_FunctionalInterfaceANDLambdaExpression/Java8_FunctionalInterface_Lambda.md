# Java 8 Functional Interface & Lambda Expressions

## 1. Functional Interface

A **Functional Interface** is an interface that contains **only one abstract method**.  
It can also have:

- N default methods
- N static methods

**SAM (Single Abstract Method):** The only abstract method in the functional interface.

### Example:

```java
// Compile-time error: More than one abstract method
@FunctionalInterface
interface One {
    void m1();
    void m2(); //  Error
}

// Compile-time error: No abstract method
@FunctionalInterface
interface Two {
} //  Error

// Valid Functional Interface
@FunctionalInterface
interface Three {
    void m1(); //  Single abstract method
}
```

---

## 2. Importance and Implementation of Functional Interface

- Enables **functional programming** in Java.
- Serves as a target for **lambda expressions**, **method references**, or **anonymous classes**.
- Makes code **concise** and **readable**.

---

## 3. Lambda Expressions

Lambda expressions provide a way to **implement a single abstract method** of a functional interface **inline**, without creating a separate implementation class.

### Syntax:

1. **No parameters:**

```java
() -> {
    System.out.println("No parameters");
};
```

2. **With parameters:**

```java
(parameter1, parameter2) -> {
    // code block
};
```

---

## 4. Relation Between Functional Interface and Lambda Expressions

- Lambda expressions can **instantiate a functional interface**.
- Each lambda expression corresponds to the **implementation of the abstract method** of the functional interface.

---

## 5. Functional Programming

- Focuses on **what to do** rather than **how to do it**.
- Promotes **immutable data** and **stateless functions**.

---

## 6. Declarative Programming

- Programming paradigm where we **declare logic** without describing control flow.
- Example: SQL, Java Streams, Lambda expressions.

---

## 7. Example: Functional Interface

```java
package com.training.java8.features;

@FunctionalInterface
public interface Calculate {
    // Only one abstract method
    void printName();

    // Default methods
    default void methodDefaultOne() {
        System.out.println("this is default method");
    }

    default void methodDefaultTwo() {
        System.out.println("this is default method");
    }

    // Static method
    static void methodStaticOne() {
        System.out.println("This is static method");
    }
}
```

---

## 8. Implementing Functional Interface

```java
package com.training.java8.features;

public class Camel implements Calculate {
    @Override
    public void printName() {
        System.out.println("This is Camel class implementation");
    }
}
```

---

## 9. Using Functional Interface & Lambda Expressions

```java
package com.training.java8.features;

public class Demo {
    public static void main(String[] args) {
        // Interface referring to implementation class
        Calculate calc = new Camel();
        calc.printName();

        // Lambda Expression Implementation
        Calculate abc = () -> {
            System.out.println("This is Abc company calc");
        };
        Calculate xyz = () -> {
            System.out.println("This is XYZ company calc");
        };

        abc.printName();
        xyz.printName();
    }
}
```

**Output:**

```
This is Camel class implementation
This is Abc company calc
This is XYZ company calc
```

---

## 10. Functional Interface with Parameters

```java
package com.training.java8.features.params;

@FunctionalInterface
public interface ClacOperations {
    double opertaion(int a, int b);

    default void printInfo() {
        System.out.println("This is default data.. of method");
    }

    static void typeOfOpertions() {
        System.out.println("Static content: Arithmetic Operations");
    }
}
```

---

### Example Usage

```java
package com.training.java8.features.params;

public class FunctionalInterfaceWithParamsDemo {

    public static void main(String[] args) {
        // 1st lambda expression: Addition
        ClacOperations addition = (int x, int y) -> {
            System.out.println("Values are: " + x + "," + y);
            return x + y;
        };
        System.out.println(addition.opertaion(30, 40));

        // 2nd lambda expression: Subtraction
        ClacOperations substraction = (p, q) -> {
            return p - q;
        };
        System.out.println(substraction.opertaion(100, 50));

        // 3rd lambda expression: Multiplication
        ClacOperations multiplication = (p, q) -> p * q;
        System.out.println(multiplication.opertaion(20, 20));

        // Execute default method
        multiplication.printInfo();

        // Execute static method
        ClacOperations.typeOfOpertions();
    }
}
```

**Output:**

```
Values are: 30,40
70.0
50.0
400.0
This is default data.. of method
Static content: Arithmetic Operations
```

---

## 11. Extending Interfaces Without Abstract Methods

```java
package com.training.java8.features.params;

public interface ClaculateInterfaceWithoutAbstractMethod {
    default void printInfo() {
        System.out.println("This is default data.. of method");
    }

    static void typeOfOpertions() {
        System.out.println("Static content: Arithmetic Operations");
    }
}

@FunctionalInterface
public interface ClacOperations extends ClaculateInterfaceWithoutAbstractMethod {
    double opertaion(int a, int b);
}
```
