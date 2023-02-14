package group_project7;

import java.util.Scanner;
public class NumberPower {
    public static void main(String[] args) {
        /**
         * User will provide two numbers, write a program that finds the result of one number raised to the power of another
         *
         * Example output:
         * Enter the base number: 2
         * Enter the power number: 3
         * Result: 8
         *
         */

        Scanner console = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = console.nextInt();
        System.out.print("Enter the power number: ");
        int power = console.nextInt();

        // TODO WRITE CODE HERE
        System.out.println("Result: " + countPowerOfNums(base, power));

    }

    public static int countPowerOfNums(int base, int power) {
        // TODO IMPLEMENT METHOD
        int num = 1;
//        num = (int) Math.pow(base, power);
////        return num;

        while (power > 0){
            num *= base;
            power--;
        }
        return num;
    }
}
