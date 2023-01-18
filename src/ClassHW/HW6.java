package ClassHW;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 6 .1
        System.out.print("Input number: ");
        int num = input.nextInt();
        if (num > 6) {
            System.out.println("Invalid Input");
        } else if (num == 0) {
            System.out.println("Sunday");
        } else if (num == 1) {
            System.out.println("Monday");
        }else if (num == 2) {
            System.out.println("Tuesday");
        }else if (num == 3) {
            System.out.println("Wednesday");
        }else if (num == 4) {
            System.out.println("Thursday");
        }else if (num == 5) {
            System.out.println("Friday");
        }else if (num == 6) {
            System.out.println("Saturday");
        }



//     6.2
        System.out.println("Welcome to the Beverly Hills\n" +
                "Are you traveling first time here(true/false)?");
        boolean answer = input.nextBoolean();
        if (answer){
            System.out.println("Enjoy your stay");
        } else {
            System.out.println("You have got a 10% discount on your stay\n" +
                    "Enjoy your stay");
        }

    }
}
