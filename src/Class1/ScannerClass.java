package Class1;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //              Scanner
        //        System.out.println("Are you married? (married or single)");
        //        String text = input.nextLine(); //  will enable us to input and int data to our
        //        boolean b = text == "married";
        //        System.out.println(b);
        //        System.out.println("Marital status: " + b);


        System.out.println("Age: ");
        int age = input.nextInt();
        System.out.println("CreditScore: ");
        double creditScore = input.nextDouble();
        System.out.println("Marital status (true or false): ");
        boolean m = input.nextBoolean();
        if (age > 25 && creditScore > 700 && m == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
