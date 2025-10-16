## Method Reference in java:

- What is Method reference
- Method reference v/s Lambda Expression
- Types of Method Reference with Example
- Use case Of method reference

- Method reference are a special type of lambda expression
- :: ->method reference delimiter
- Class Name/instance reference ::methodName
- 4types
- 1. reference to static methods
     ClassName::methodName
  - the method which is referred should be matched to method signature of FI abstract method
- reference to instance methods
  - Accessing instance method with class name
  - on condition
  - the method which we are referring from any class,that method should not contain any method arguments and the same method should contains same return type of abstract method which defined in side Functional Interface
- reference to instance methods of arbitrary object of given type
- reference to constructors
- make sure abstract method parameters are part of constructor definition w.r.to order and type

# Method Reference in Java

### Employee.java

```java
package com.training.method.references;

public class Employee {

    private int id;
    private String name;
    private String gender;
    private double salary;

    // static method
    static boolean validateEmpdetails(Employee employee) {
        if(employee.getId()!=0&&employee.getName()!=null)
            return true;
        return false;
    }
    // non-static method/instance method
     boolean validateEmpdetails2(Employee employee) {
        if(employee.getId()!=0&&employee.getName()!=null)
            return true;
        return false;
    }
    boolean validSalary() {
        return this.getSalary()>0?true:false;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
```

### ConverToUpperCase.java

```java
package com.training.method.references;

@FunctionalInterface
public interface ConverToUpperCase {

    String convertToUppercase(String value);
}
```

### MethodRefrencesDemo.java

```java
package com.training.method.references;

public class MethodRefrencesDemo {

    public static void main(String[] args) {
        ConverToUpperCase toUpperCase=(value)->{
            System.out.println("Inside lambada notation converting into uppercase");
            return value.toUpperCase();
        };
        System.out.println(toUpperCase.convertToUppercase("java method refrenxce "));

        // method references
        // re -using/executing a pre defined method from String class
        // assigning that method reference of class
        ConverToUpperCase uppercaseTwo=String::toUpperCase;
        System.out.println(uppercaseTwo.convertToUppercase("java method refrences"));
    }

}
```

### MethodReferenceDemo.java

```java
package com.training.method.references;

import java.util.Arrays;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        // static method :Class  named
        EmployeeValidation validEmployee=Employee::validateEmpdetails;
        //create Instance for the class where the method is located
        Employee e=new Employee();
        EmployeeValidation valEmployeeValidation=e::validateEmpdetails2;
        // validating Employee details
        Employee emp1=new Employee();
        System.out.println(validEmployee.isValidEmployee(emp1));
        Employee emp2=new Employee();
        emp2.setId(123);
        emp2.setName("Raushan Singh");
        emp2.setGender("Male");
        emp2.setSalary(5000);
        System.out.println(validEmployee.isValidEmployee(emp2));
        System.out.println(valEmployeeValidation.isValidEmployee(emp2));
        // access instance method with class name also
        EmployeeValidation valEmployeeValidation2=Employee::validSalary;
        System.out.println(valEmployeeValidation2.isValidEmployee(emp2));
        String[] values= {"Raushan","java","Spring","Methods"};
         Arrays.sort(values, (o1,o2)->o1.compareToIgnoreCase(o2) );
        for(String str:values) {
            System.out.println(str);
        }
    }

}
```

### EmployeeValidation.java

```java
package com.training.method.references;
@FunctionalInterface
public interface EmployeeValidation {

    boolean isValidEmployee(Employee employee);
}
```

### ConstructorDemo.java

```java
package com.training.method.references;

public class ConstructorDemo {
    public static void main(String args[]) {
        GetEmployeeInstance employee=Employee::new;
        Employee emp = employee.getEmployee(10, "Raushan Singh");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
```

### GetEmployeeInstance.java

```java
package com.training.method.references;
@FunctionalInterface
public interface GetEmployeeInstance {

    Employee getEmployee(int id,String name);
}
```
