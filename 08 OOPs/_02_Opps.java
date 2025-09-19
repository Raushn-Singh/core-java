
import java.util.Scanner;

// import java.util.Scanner;
// class Car {
//     String model;
//     String regNo;
//     double maxSpeed;
//     int noOfWheels;
//     float currentSpeed;
//     /**
//      * constructor : it is a special type of method which is used to initialize the
//      * data member or member functions of a class.
//      */
//     Car() {
//         currentSpeed = 0.0f;
//         noOfWheels = 4;
//         model = "bugati chiron";
//         maxSpeed = 400;
//     }
//     void accelerate() // behaviour
//     {
//         System.out.println("accelerating " + model + "...");
//         while (currentSpeed < maxSpeed)
//             currentSpeed += 10;
//         System.out.println("current speed is " + currentSpeed);
//     }
//     void applyBreak() {
//         System.out.println("applying break....");
//         while (currentSpeed != 0) {
//             currentSpeed -= 10;
//         }
//         System.out.println("car stopped :" + currentSpeed);
//     }
//     void inputCarDetails(Scanner sc)
//     {
//         System.out.print("Enter car model No:");
//         model=sc.nextLine();
//         System.out.print("Enter car reg No:");
//         regNo=sc.nextLine();
//         System.out.print("Enter car Max speed:");
//         maxSpeed=sc.nextFloat();
//     }
//     void showCarDetails() {
//         System.out.println("***** Car Details *****");
//         System.out.println("model :" + model);
//         System.out.println("regNo :" + regNo);
//         System.out.println("maxSpeed :" + maxSpeed);
//         System.out.println("noOfWheels :" + noOfWheels);
//         System.out.println("currentSpeed :" + currentSpeed);
//     }
// }
// public class _14_ClassObj {
//     public static void main(String[] args) {
//         // object -> instance of a class
//         // the process of making an object is called instantiation
//         // Car vineetKiCar = new Car();// real world entity
//         // vineetKiCar.accelerate();
//         // three ways to set value in class object
//         // 1. using object reference
//         // 2. using method
//         // 3. using parameterized constructor
//         Scanner sc = new Scanner(System.in);
//         // Car keshavKiCar = new Car();
//         // System.out.print("Enter Car Model:");
//         // keshavKiCar.model = sc.nextLine();
//         // System.out.print("Enter Car Reg No:");
//         // keshavKiCar.regNo = sc.nextLine();
//         // System.out.print("Enter Car Max Speed:");
//         // keshavKiCar.maxSpeed = sc.nextFloat();
//         // keshavKiCar.accelerate();
//         // keshavKiCar.applyBreak();
//         // keshavKiCar.showCarDetails();
// /* 
//         Car chiranjeevKiCar=new Car();
//         chiranjeevKiCar.inputCarDetails(sc);
//         System.out.println("--------------------------");
//         chiranjeevKiCar.accelerate();
//         System.out.println("--------------------------");
//         chiranjeevKiCar.applyBreak();
//         System.out.println("--------------------------");
//         chiranjeevKiCar.showCarDetails(); */
// /* 
//         Car rahulKiCar=new Car();
//         rahulKiCar.inputCarDetails(sc);
//         System.out.println("--------------------------");
//         rahulKiCar.accelerate();
//         System.out.println("--------------------------");
//         rahulKiCar.applyBreak();
//         System.out.println("--------------------------");
//         rahulKiCar.showCarDetails(); */
//         Car[] cars=new Car[2];
//         for (int i = 0; i < cars.length; i++) 
//         {
//             cars[i]=new Car();
//             System.out.println(" Enter Car "+(i+1)+" Details ..");
//             cars[i].inputCarDetails(sc);
//             System.out.println("--------------------------");
//             // cars[i].accelerate();
//             // System.out.println("--------------------------");
//             // cars[i].applyBreak();
//             // System.out.println("--------------------------");
//             sc.nextLine();
//         }
//         for (int i = 0; i < cars.length; i++) {
//             cars[i].showCarDetails();
//         }
//         sc.close();
//     }
// }
class car {

    String model;
    String regNo;
    double maxSpeed;
    float currentSpeed;
    int noOfWheels;

    car() {
        model = "";
        regNo = "";
        maxSpeed = 400;
        currentSpeed = 0.0f;
        noOfWheels = 4;

    }

    void accelerate() {
        System.out.println("accelerating ..." + model);
        while (currentSpeed < maxSpeed) {
            currentSpeed += 10;
        }
        System.out.println("Current speed is" + currentSpeed);
    }

    void applyBreak() {
        System.out.println("Applying break :" + model);
        while (currentSpeed > 0) {
            currentSpeed -= 10;
        }
        System.out.println("Current Speed is " + currentSpeed);
    }

    void inputCarDetails(Scanner sc) {
        System.out.println("Enter the car details:");
        System.out.println("Enter the modelNumber");
        model = sc.nextLine();
        System.out.println("Enter the regNo");
        regNo = sc.nextLine();
        System.out.println("Enter the MaxSpeed");
        maxSpeed = sc.nextFloat();
    }

    void showCarDetails() {
        System.out.println("Car model is" + model);
        System.out.println("Car regNo is" + regNo);
        System.out.println("Car currentSpeed is " + currentSpeed);
        System.out.println("Car noOfWheels is " + noOfWheels);
        System.out.println("Car maxSpeed is " + maxSpeed);

    }

}

public class _02_Opps {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        car RohitKiCar = new car();
        // RohitKiCar.model = "Rohit,s car";
        // RohitKiCar.regNo = "HR550001";
        // System.out.println("Car Model Number :" + RohitKiCar.model);
        // System.out.println("Car Registration Number :" + RohitKiCar.regNo);
        // RohitKiCar.accelerate();
        // RohitKiCar.applyBreak();
        RohitKiCar.inputCarDetails(sc);
        RohitKiCar.showCarDetails();
    }
}
