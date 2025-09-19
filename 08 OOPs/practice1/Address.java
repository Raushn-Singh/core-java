
import java.util.Scanner;

class Address {

    String street;
    String city;
    String state;
    String country;
    int pincode;

    public Address() {
    }

    public Address(String street, String city, String state, String country, int pincode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    void inputAddressDetails(Scanner sc) {

        System.out.println("Enter the name of the street :");
        street = sc.nextLine();
        System.out.println("Enter the Pincode");
        pincode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the City Name :");
        city = sc.nextLine();
        System.out.println("Enter State Name :");
        state = sc.nextLine();
        System.out.println("Enter Country Name :");
        country = sc.nextLine();

    }

    void ShowAddressDetails() {
        System.out.println("Street Name :" + street);
        System.out.println("Pincode  :" + pincode);
        System.out.println("City Name :" + city);
        System.out.println("State Name" + state);
        System.out.println("Country Name :" + country);

    }

}
