package ClassHW;

import java.util.Scanner;

public class HW13_loop {
    /*
    *
    Write a program that uses a while loop to print the odd numbers from 1 to 20. => 1,3,5,7,9,11,13,15,17,19
    Write a program that uses a while loop to print the sum of the numbers from 1 to 10. => 1+2+3+4+5+6+7+8+9+10. result should be 55?
    Write a program that uses a while loop to print the multiplication table for a given number.
    **/
    public static void main(String[] args) {
        System.out.println("-----------TASK1-----------");
        int num = 0;
        while (num < 20){
            num++;
            if (num % 2 == 0){
                continue;
            } else {
                System.out.println(num);
            }
        }
        System.out.println("---------TASK 2------------------------------");
        int num2 = 0;
        int n = 0;

        while (num2 < 10){
            num2++;
            n += num2;
        }
        System.out.println(n);

        System.out.println("--------------TASK 3------------------");

        int num3 = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = sc.nextInt();
        while (num3 < 10){
            num3++;
            sum = input * num3;
            System.out.println(input + " * " + num3 + " = " + sum);



        }

    }

}
