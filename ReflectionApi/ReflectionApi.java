// The process of analyzing all capabilities of a particular class at runtime is called as Reflection
// capabilities of the class -> metadata of the class -> Description of class -->all declarative information of this class --> name of the class,
// ,access modifiers of the class ,super class metadata ,implemented interface
// metadata,variables metadata , method metadata,constructor metadata

// reflection api -> to perform reflection java has provided a set of predefined
// classes called as "reflection api"

// reflection api is much suitable in products development like compilers ,jvm
// ,server, framework, IDEs

// private class A{} compiler give error

// class A{
// static{
// System.out.println("Class Loading ...");
// }
// A(int i){
// System.out.println("Object Creating...");
// }
//
// }

// Class c= Class.ForName("A")
// Object obj=c.newInstance(); --> instantiation exception

// To perform reflection api java has provided the complete predefined library
// [reflection_Api] in the form of the following classes.
// java.lang.Class
// java.lang.reflect.Field
// java.lang.reflect.Method
// java.lang.reflect.Constructor
// java.lang.reflect.Modifier

// 1. java.lang.Class
// ---------------
// it able to represent metadata of a particular class which includes class name
// , access modifiers of class , super class metadata , implemented interfaces
// metadata,variables metadata , method metadata,.....

// to create object for java.lang.Class
// 1. by using forName() method
// ----------------------------
// public static Class forName(String className) throws ClassNotFoundsException
// Ex: Class c= Class.forName("Employee") // current location // predefined
// library // class path environment variable

// abstract class Employee implements Serializable, Comparable<String> {

// }

// public class ReflectionApi {
// public static void main(String[] args) throws Exception {
// Class c = Class.forName("Employee");
// System.out.println(c.getName());
// }
// }

// 2. by using getClass() method from Object Class
// ------------------------------------------------
// Employee e=new Employee();
// Class c=emp.getClass();
// class Employee {

// }

// public class ReflectionApi {
// public static void main(String[] args) {
// Employee emp = new Employee();
// Class c = emp.getClass();
// System.out.println(c.getName());
// }
// }

// 3. by using .class file name
// ----------------------------
// in java , every .class file name is acting as java.lang.Class object with
// metadata of the respective class
// Class c= Employee.class
// class Employee {

// }

// public class ReflectionApi {
// public static void main(String[] args) {
// Class c = Employee.class;
// System.out.println(c.getName());
// }
// }

// class Employee implements Cloneable, Serializable, Remote {
// int eno;
// String ename;
// float esal;
// String eaddr;

// public Employee() {

// }

// public Employee(int eno) {

// }

// public Employee(int eno, String ename) {

// }

// public Employee(int eno, String ename, float esal) {

// }

// public Employee(int eno, String ename, float esal, String eaddr) {

// }

// public void add(int eno, String ename, float esal, String eaddr) {

// }

// public void search(int eno) {

// }

// public void update(int eno, String ename, float esal, String eaddr) {

// }

// public void delete(int eno) {

// }
// }

// public class ReflectionApi {
// public static void main(String[] args) {
// Class c = Employee.class;
// System.out.println(c.getName());
// }
// }

// abstract class Employee implements Cloneable, Serializable, Remote {

// }

// public class ReflectionApi {
// public static void main(String[] args) throws Exception {
// Class c = Class.forName("Employee");
// System.out.println("Class Name : " + c.getName());
// System.out.println("Super Class : " + c.getSuperclass().getName());
// Class[] cls = c.getInterfaces();
// System.out.println("Interface : ");
// for (Class cl : cls) {
// System.out.println(cl.getName());
// }
// System.out.println();
// int val = c.getModifiers();
// String modifiers = Modifier.toString(val);
// System.out.println("Access Modifiers : " + modifiers);
// }
// }

// 2. java.lang.reflect.Field:
// it able to represent a particular variable metadata which includes variables
// name , data type , access modifiers , value of the variable.
// Class c=Class.forName("Employee");
// Filed[] field1=c.getFileds(); --> if we want to get data only public
// Filed[] field2=c.getDecalredField();

// public String getName()
// public Class getType()
// public YYY get(Field f)
// public int getModifiers()
// public static String toString(int value)

// class Employee {
// private static int age = 30;
// public static int eno = 111;
// protected final static String ename = "Raushan";
// volatile static transient float esal = 50000.0f;
// static final String eaddr = "HYD";
// }

// public class ReflectionApi {
// public static void main(String[] args) throws Exception {
// Employee emp = new Employee();
// Class c = emp.getClass();
// Field[] fields = c.getDeclaredFields();
// for (Field f : fields) {
// f.setAccessible(true);
// System.out.println(" Name : " + f.getName());
// System.out.println("Data type : " + f.getType());
// System.out.println(" value : " + f.get(f));
// System.out.println(" Access Modifier : " +
// Modifier.toString(f.getModifiers()));
// System.out.println("--------------------------------------");
// }
// }
// }

// 3. java.lang.reflect.Method :
// it able to represent a particular method metadata which includes method name
// ,method return type, method access specifiers ,method parameter list, method
// throws exception list,...

// Class c=Class.ClassforName("Employee");
// Method[] mthd1=c.getMethods(); // it return only public method which are
// available in respective class and super class
// Method[] mthd2=c.getDeclaredMethods(); // it can be use to get all the method
// of respective class

// public String getName()
// public Class getReturnType()
// public Class[] getParameterTypes()
// public Class[] getExceptionTypes()
// public static String toString(int value)

// class Employee {
// public static void add(int eno, String ename, float esal, String eaddr)
// throws ClassNotFoundException, RemoteException {

// }

// public static final String search(int eno) throws NotSerializableException,
// RemoteException {
// return " ";
// }

// public final void update(int eno, String ename, float esal, String eaddr)
// throws ClassCastException, NullPointerException {

// }

// public String delete(int eno) throws CloneNotSupportedException, SQLException
// {
// return "";
// }
// }

// public class ReflectionApi {
// public static void main(String[] args) throws Exception {
// Class c = Class.forName("Employee");
// Method[] mthds = c.getDeclaredMethods();
// for (Method m : mthds) {
// System.out.println("Method Name : " + m.getName());
// System.out.println("Return Type : " + m.getReturnType().getName());
// System.out.println("Modifiers : " + Modifier.toString(m.getModifiers()));
// Class[] cls = m.getParameterTypes();
// System.out.println("parameter Types : ");
// for (Class cl : cls) {
// System.out.print(cl.getName() + " ");
// }
// System.out.println();
// System.out.println("Exception type : ");
// Class[] clas = m.getExceptionTypes();
// for (Class cal : clas) {
// System.out.print(cal.getName() + " ");
// }
// System.out.println();
// System.out.println("-------------------------------------");
// }
// }
// }

// 3. java.lang.reflect.constructor
// it able to represent metadata of a particular constructor which includes
// Constructor Name, Access Modifiers of the constructor , parameter types ,
// throws exception types...

// Class c=Class.forName("Employee")
// Constructor[] cons1=c.getConstructors();
// Constructor[] cons1=c.getDeclaredConstructor();

// public String getName()
// public int getModifiers()
// public static String toString(int mod)
// public class[] getParameterTypes()
// public class[] getExceptionTypes()

// class Employee {
//   public Employee() throws SQLException, RemoteException {

//   }

//   public Employee(int eno) throws NotSerializableException, RemoteException {

//   }

//   public Employee(int eno, String ename) throws CloneNotSupportedException, SQLException {

//   }

//   public Employee(int eno, String ename, float esal) throws ClassNotFoundException, RemoteException {

//   }

//   public Employee(int eno, String ename, float esal, String eaddr) throws ClassCastException {

//   }
// }

// public class ReflectionApi {
//   public static void main(String[] args) throws Exception {
//     Class c = Class.forName("Employee");
//     Constructor[] cons = c.getDeclaredConstructors();
//     for (Constructor con : cons) {
//       System.out.println("Name  : " + con.getName());
//       System.out.println("Access Modifiers : " + Modifier.toString(con.getModifiers()));
//       System.out.print("Parameters Types : ");
//       Class[] cls = con.getParameterTypes();
//       for (Class cl : cls) {
//         System.out.print(cl.getName());
//       }
//       System.out.println();
//       System.out.println("Exception Type : ");
//       Class[] clas = con.getExceptionTypes();
//       for (Class cla : clas) {
//         System.out.println(cla.getName() + " ");
//       }
//       System.out.println();
//       System.out.println("--------------------------------");
//     }
//   }
// }

class Employee {
  private int eno;
  private String ename;
  private float esal;
  private String eaddr;

  public int getEno() {
    return eno;
  }

  public void setEno(int eno) {
    this.eno = eno;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public float getEsal() {
    return esal;
  }

  public void setEsal(float esal) {
    this.esal = esal;
  }

  public String getEaddr() {
    return eaddr;
  }

  public void setEaddr(String eaddr) {
    this.eaddr = eaddr;
  }
}

// public class ReflectionApi {
// public static void main(String[] args) throws Exception {
// BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
// PropertyDescriptor[] props = beanInfo.getPropertyDescriptors();
// System.out.println(beanInfo);
// for (PropertyDescriptor p : props) {
// if (!p.getName().equals("class")) {

// System.out.println(" Property Name : " + p.getName());
// System.out.println(" Property Type : " + p.getPropertyType());
// System.out.println(" Read Method : " + p.getReadMethod().getName());
// System.out.println(" Write Method : " + p.getWriteMethod().getName());
// System.out.println("--------------------------------------");
// }
// }
// }
// }
