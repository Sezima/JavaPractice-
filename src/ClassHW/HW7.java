package ClassHW;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        7.1
        System.out.println("numbers must be different.");
        System.out.print("1: ");
        int a = input.nextInt();
        System.out.print("2: ");
        int b = input.nextInt();
        System.out.print("3: ");
        int c = input.nextInt();

        if (a > b && a > c)
            System.out.println(a + " is the greatest");
        else
            if (b > a && b > c)
            System.out.println(b + " is the greatest");
         else
                System.out.println(c + " is the greatest");


//             7.2

        System.out.print("Age:  ");
        int age = input.nextInt();
        System.out.print("Salary:  ");
        int salary = input.nextInt();
        System.out.print("Amount: ");
        int amount = input.nextInt();


        if (age >= 18) {
            if (salary < 1000) System.out.println("Not Eligible");
            else {
                if (salary >= 1001 && salary <= 5000) System.out.println("Limit 10000");
                else if (salary >= 5001 && salary <= 10000) System.out.println("Limit 20000");
                else System.out.println("limit 50000");
            }


            if (amount < 5000) System.out.println("No Deduction In Limit");
            else
            if (amount >= 5001 && amount <= 20000) System.out.println("Deduct Half Of The Loan Amount ");
            else System.out.println("Not Eligible");
        } else System.out.println("You are note eligible");

    }
}
