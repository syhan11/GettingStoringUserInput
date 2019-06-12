import java.util.Scanner;

public class GettingStoringInput {
    public static void main(String[] arg) {
        String firstInitial, lastName, houseNumber, streetName, streetType, city;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an initial for your first name:");
        firstInitial = keyboard.next();

        System.out.print("Enter your last name:");
        lastName = keyboard.next();

        System.out.print("Enter your house number:");
        houseNumber = keyboard.next();

        System.out.print("Enter your street name:");
        streetName = keyboard.next();

        System.out.print("Enter your street type:");
        streetType = keyboard.next();

        System.out.print("Enter your city:");
        city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
