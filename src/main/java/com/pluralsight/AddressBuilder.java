package com.pluralsight;
import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        System.out.print("Full name: ");
        String name = myscanner.nextLine();

        System.out.println("  ");

        System.out.print("Billing Street: ");
        String billingStreet = myscanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = myscanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = myscanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = myscanner.nextLine();

        System.out.println(" ");

        System.out.print("Shipping Street: ");
        String shippingStreet = myscanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = myscanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = myscanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = myscanner.nextLine();

        System.out.println(" ");

        StringBuilder address = new StringBuilder();

        address.append(name + ", \n");
        address.append("\n");
        address.append("Billing Address: \n");
        address.append(billingStreet + ", \n");
        address.append(billingCity + ", " + billingState + " " + billingZip + "\n");
        address.append("\n");
        address.append("Shipping Address: \n");
        address.append(shippingStreet + ", \n");
        address.append(shippingCity + ", " + shippingState + " " + shippingZip + "\n");

        System.out.println(address);

    }
}
