import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    // 1. add(E e)

    // Adds an element at the end of the list.
    // Adding elements
    list.add("Apple");
    list.add("Banana");
    list.add("Mango");

    System.out.println("List after add: " + list);

    // 2. add(int index, E element)

    // Inserts element at a specific index.
    list.add(1, "Orange"); // Insert at index 1
    System.out.println("After insertion: " + list);

    // 3. get(int index)

    // Returns element at a specific index.
    String fruit = list.get(2);
    System.out.println("Element at index 2: " + fruit);

    // 4. set(int index, E element)

    // Replaces element at given index.
    list.set(2, "Grapes");
    System.out.println("After set: " + list);

    // 5. remove(int index) or remove(Object o)

    // Removes element by index or by value.

    list.remove(1); // removes element at index 1
    list.remove("Mango"); // removes Mango
    System.out.println("After remove: " + list);

    // 6. size()

    // Returns number of elements.
    System.out.println("Size: " + list.size());

    // 7. contains(Object o)

    // Checks if list has an element.
    System.out.println("Contains Apple? " + list.contains("Apple"));

    // 8. isEmpty()

    // Checks if list is empty.
    System.out.println("Is list empty? " + list.isEmpty());

    // 9. clear()

    // Removes all elements.
    list.clear();
    System.out.println("After clear: " + list);
  }
}

// add() → Insert element

// get() → Access element

// set() → Update element

// remove() → Delete element

// size() → Count elements

// contains() → Check element presence

// isEmpty() → Check if empty

// clear() → Remove all