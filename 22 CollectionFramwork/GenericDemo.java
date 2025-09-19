class Node<T> {
  T data;
  Node<T> Next;

  public Node(T data) {
    this.data = data;
  }

}

public class GenericDemo {
  public static void main(String[] args) {
    // Generics in Java allow us to write classes, interfaces, and methods that can
    // work with different data types while maintaining type safety.
    Node<Integer> node1 = new Node<>(10);
    System.out.println(node1.data + " Of type" + node1.data.getClass().getName());

    Node<String> node2 = new Node("Aman");
    System.out.println(node2.data + " Of Class" + node2.data.getClass().getName());

  }
}
