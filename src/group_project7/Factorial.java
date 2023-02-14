package group_project7;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /**
         * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
         * Calculate factorial and output result to the console.
         * ex: 5! = 5 * 4 * 3 * 2 * 1
         * Enter a number:
         * 5
         * Factorial result: 120
         */

        // TODO write your code here
//        Scanner sc = new Scanner(System.in);
//        long number = sc.nextLong();
//        System.out.println(calculate(number));


        int number = 3;
        long sum = 1;
        while (number > 1){
            sum *= number;
            number-=1;
        }
        System.out.println(sum);




    }

//
//    public static long calculate(long number) {
//        // TODO IMPLEMENT METHOD
//        long sum = 1;
//        while (number > 1){
//            sum *= number;
//            number-=1;
//        }
//        return sum;
//    }

}
