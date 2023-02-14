package Class_loop;

import java.util.Scanner;

public class eachDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();

        if (num - 1000 > 0){
            int a = num/1000;

            int b = num%1000;
            int c = b/100;
            int d = b % 100;
            int v = d /10;
            int e = v % 10;


            System.out.println(e);
            System.out.println(v);
            System.out.println(c);
            System.out.println(a);


        }


    }
}
