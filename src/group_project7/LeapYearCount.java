package group_project7;

import java.util.Scanner;

public class LeapYearCount {
    public static void main(String[] args) {
        /**
         * We have a customer who was born on a leap date (04.28.1950). In 2010 she turned 60,
         * but officially she is 15 years old, since there were only 15 leap years between 1950 and 2010.
         *
         * Write a program that takes two years and counts the number of leap years between two years
         *
         * Example output:
         * Enter first year: 1950
         * Enter second year: 2010
         *
         * Number of leap years: 15
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first year: ");
        int startYear = sc.nextInt();
        System.out.print("Enter your second year: ");
        int endDate = sc.nextInt();
        System.out.println("Number of leap years: " + countLeapYearsBetweenYears(startYear, endDate));

        // TODO WRITE YOUR CODE HERE

    }
    public static int countLeapYearsBetweenYears(int startYear, int endYear) {
        // TODO IMPLEMENT METHOD
        int year = 0;
        while (startYear < endYear){

            if (((startYear % 400 == 0) && (startYear % 100!= 0)) || (startYear%4 == 0)) {
                year++;
            }
            startYear++;

        }
        return year;
    }
}
