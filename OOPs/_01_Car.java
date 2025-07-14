
class car {

    String model;
    String regno;
    double maxspeed;
    int noOfWheels;
    float currentSpeed;
    // same as class name and no return value 
    // it is a special type of method which is used to initialize the data member or member function of the class

    car() {
        currentSpeed = 0.0f;
        noOfWheels = 4;
        model = "bugati chiron";
        maxspeed = 400;
    }

    void accelerate() {
        System.out.println("Accelerating" + model + ".....");
        while (currentSpeed < maxspeed) {
            currentSpeed += 10;
        }
        System.out.println("Accelerated to " + currentSpeed + "km/h");
    }

    void applyBreak() {
        System.out.println("Applying break......");
        while (currentSpeed != 0) {
            currentSpeed -= 10;
        }
        System.out.println("Car stopped" + currentSpeed);
    }

    void showCarDetails() {
        System.out.println("Model: " + model);
        System.out.println("Registration Number: " + regno);

    }

}

public class _01_Car {

    public static void main(String args[]) {

    }
}
