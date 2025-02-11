import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double price = 0;
            double shippingCost = 0;
            double totalCost;

            System.out.print("Enter the price of the item: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();

                if (price >= 100) {
                    shippingCost = 0;
                } else {
                    shippingCost = price * 0.02;
                }

                totalCost = price + shippingCost;
                System.out.printf("Shipping cost: $%.2f%n", shippingCost);
                System.out.printf("Total price: $%.2f%n", totalCost);
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
