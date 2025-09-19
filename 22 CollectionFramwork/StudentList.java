
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// class Student implements Comparable<Student> 
class Student {
  private int id;
  private String name;
  private String email;

  public Student() {
  }

  public Student(String email, int id, String name) {
    this.email = email;
    this.id = id;
    this.name = name;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Student{");
    sb.append("id=").append(id);
    sb.append(", name=").append(name);
    sb.append(", email=").append(email);
    sb.append('}');
    return sb.toString();
  }

  // @Override
  // public int compareTo(Student o) {
  // // return this.id - o.getId();
  // return o.getName().compareTo(this.getName());
  // }

}

public class StudentList {
  public static void main(String[] args) {
    Student stu1 = new Student();
    stu1.setId(101);
    stu1.setName("Raushan");
    stu1.setEmail("raushan@gmail.com");
    ArrayList<Student> students = new ArrayList<>();
    students.add(stu1);
    students.add(new Student("b@gmail.com", 100, "B"));
    students.add(new Student("a@gmail.com", 102, "C"));

    System.out.println(students.contains(new Student("b@gamil.com", 100, "B")));
    System.out.println(students.contains(stu1));

    // Collections.sort(students);
    // Collections.sort(students, new StuNameComparator());
    // Collections.sort(students,(s1,s2)->s1.getId()-s2.getId());
    Collections.sort(students, new Comparator<Student>() {
      public int compare(Student s, Student s2) {
        return s.getId() - s2.getId();
      }
    });
    students.forEach(s -> {
      System.out.println("Id :" + s.getId());
      System.out.println("Name :" + s.getName());
      System.out.println(s.getEmail());
    });
  }
}

class StuNameComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    // TODO Auto-generated method stub
    return o1.getName().compareTo(o2.getName());
  }

}