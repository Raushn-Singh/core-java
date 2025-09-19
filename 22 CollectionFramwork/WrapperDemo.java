import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
  public static void main(String args[]) {
    // "A wrapper class in Java is a class that converts a primitive data type (like
    // int, char, boolean) into an object. For example, int becomes Integer, char
    // becomes Character. We need wrapper classes because Java collections (like
    // ArrayList, HashMap) work only with objects, not primitives. They also give us
    // extra features like autoboxing/unboxing, parsing methods, and null handling.
    // This makes code more flexible and object-oriented."

    // Integer num1,num2,result;
    // num1=null;
    // num2=20;
    // result =num1+num2
    // System.out.println("The sum of "+num1+"and"+num2+" is "+result);

    // int num1 = 10;
    // Integer num2;
    // num2 = num1;// auto-boxing

    // int num3 = num2;// un-boxing

    // System.out.println(10.getClass()); -- throws exception

    // System.out.println(num2.getClass());

    // String s = "10";
    // int num = Integer.parseInt(s);
    // System.out.println(num);

    // List num = new ArrayList();
    // num.add(10);
    // num.add(20);
    // num.add(10.543);
    // num.add(true);

    // for (int i = 0; i < num.size(); i++) {
    // System.out.println(num.get(i).getClass());
    // }

    // List<Integer> num = new ArrayList<>();

    // num.add(10);
    // num.add(20);
    // Generics in Java allow us to write classes, interfaces, and methods that can
    // work with different data types while maintaining type safety.

    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }
    for (Integer elem : numbers) {
      System.out.println(elem);
    }


    
  }
}