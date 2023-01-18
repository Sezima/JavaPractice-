package ClassHW;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Delta Air Lines\n" +
                "Are you travelling from connecting flight(true/false)? ");
        Boolean answer = input.nextBoolean();
        if (answer == true) {
            System.out.println("Enjoy your flight");
        } else {
            System.out.println("Please proceed to the security check\n" +
                    "Enjoy your flight");
        }
    }
}
