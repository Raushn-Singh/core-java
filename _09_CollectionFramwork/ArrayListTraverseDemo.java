
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ArrayListTraverseDemo {

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    // List<Integer> asList =
    // Arrays.stream(arr).boxed().collect(Collectors.toList());
    // System.out.println(asList);

    ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));
    System.out.println(numbers);

    numbers.add(2, 25);
    System.out.println(numbers);

    // traversing
    // System.out.println("Normal fro Loop");
    // for (int i = 0; i < numbers.size(); i++) {
    // System.out.println(numbers.get(i));
    // }
    // System.out.println("For each loop");
    // for (Integer number : numbers) {
    // System.out.println(number);
    // }

    // System.out.println("Using Iterarator");
    // Iterator<Integer> iterator = numbers.iterator();
    // while (iterator.hasNext()) {
    // Integer e = (Integer) iterator.next();
    // System.out.println(e);
    // }

    // System.out.println("ListIterator");
    // ListIterator<Integer> listIterator = numbers.listIterator();
    // while (listIterator.hasNext()) {
    // Integer e = (Integer) listIterator.next();
    // }

    // ListIterator<Integer> listIterator = numbers.listIterator(numbers.size());
    // while (listIterator.hasPrevious()) {
    // Integer e = (Integer) listIterator.previous();
    // System.out.println(e);
    // }

    // functional interface
    // A functional interface is an interface with exactly one abstract method, also
    // known as a SAM (Single Abstract Method) interface. It enables the use of
    // lambda expressions and method references in Java. Common examples are
    // Runnable, Callable, and predefined interfaces from java.util.function

    numbers.forEach(ArrayListTraverseDemo::printNum);
    numbers.forEach(e -> System.out.println("Num :" + e));
    numbers.forEach(System.out::println);
    Spliterator<Integer> spliterator = numbers.spliterator();
    Spliterator<Integer> part2 = spliterator.trySplit();

    part2.forEachRemaining(e -> System.out.println(e));

    spliterator.forEachRemaining(e -> System.out.println(e));
    numbers.removeIf(e -> e > 60);
    System.out.println(numbers);
  }

  public static void printNum(Integer num) {
    System.out.println(num);
  }
}
