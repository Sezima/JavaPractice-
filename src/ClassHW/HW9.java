package ClassHW;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("operator: ");
        String operator = scanner.nextLine();
        operator = scanner.nextLine();
            switch (operator) {
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("division by zero is not allowed");
                    } else {
                        System.out.println(num1 / num2);
                    }
                    break;
                default:
                    System.out.println("Operator Error. Please try again ");
            }



//            2

        System.out.println("Enter day of the week: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("5");
                break;
            case "Tuesday":
                System.out.println("4");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("2");
                break;
            case "Friday":
                System.out.println("1");
                break;
            case "Sunday":
            case "Saturday":
                System.out.println("Weekend");
                break;
        }
    }
}
