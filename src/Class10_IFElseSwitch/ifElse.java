package Class10_IFElseSwitch;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        if statement is a logical flow control
        you can write a program that execute certain portion of the code
        only in certain control
        */



        /*
// 1
        System.out.println("Weather in fahrenheit: ");
        int weather = input.nextInt();

        if (weather >= 32 && weather < 41 ) {
            System.out.println("It's little chilly outside") ;
        }
        if (weather >= 42 && weather < 60){
            System.out.println("It's good");
        }
        if (weather >= 60) {
            System.out.println("It's ama");
        }

        System.out.print("Person 1: ");
        int a = input.nextInt();
        System.out.print("Person 2: ");
        int b = input.nextInt();
        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }


//2
        System.out.println("Input: ");

        int a = input.nextInt();
        if (a%2==0) {
            System.out.println(a + " Your number is even");
        } else {
            System.out.println(a + "is an even add");
        }

//3

        System.out.print("Month number: ");
        int month = input.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month ==10 || month == 12 || month == 8) {
            System.out.println("31 days in this month");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");

        } else {
            System.out.println("28 or 29 days");
        }


 */


//        4

        /*
           Get salary and age from user
 1. If age is less than 18 then print you're not eligible
 2. If age is more than or equal 18 and salary is less than 5000
 then print 'Sorry, you need work hard to get credit card'

 3. If age is more than or equal 18 and salary is greater than
 or equal 5000 then print you're eligible
 4. If age is more than or equal 18 and salary is greater than
 or equal to 20000 then print you'll get free credit card
         */


        System.out.print("How old are you?: ");
        int age = input.nextInt();
        if (age<18){
            System.out.println("you're not eligible");

        } else {
            System.out.print("Your salary: ");
            int salary = input.nextInt();
            if (age >= 18 && salary < 5000){
                System.out.println("'Sorry, you need work hard to get credit card'");
            } else if (age >= 18 && salary >= 5000) {
                System.out.println("you're eligible");

            } else if (age >= 18 && salary>= 20000) {
                System.out.println("you'll get free credit card");

            }
        }


    }
}
