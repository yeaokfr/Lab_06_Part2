import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double fuel = 0;
        double mpg = 0;
        double cost = 0;
        double distance;
        double costPer100Miles;

        System.out.println("How much fuel do you have (In gallons)?");
        do {
            if (scan.hasNextDouble()) {
                fuel = scan.nextDouble();
                if (fuel >= 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        System.out.println("How many miles per gallon does your car get?");
        do {
            if (scan.hasNextDouble()) {
                mpg = scan.nextDouble();
                if (mpg >= 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        System.out.println("What is the price of your fuel (Per gallon)?");
        do {
            if (scan.hasNextDouble()) {
                cost = scan.nextDouble();
                if (cost > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        costPer100Miles = (100/mpg) * cost;
        distance = fuel * mpg;

        System.out.printf("%-24s %.2f", "Your cost to drive 100 miles in $:" , costPer100Miles);
        System.out.printf("\n%-14s %.2f", "Your distance left in miles is:" , distance);

    }
}