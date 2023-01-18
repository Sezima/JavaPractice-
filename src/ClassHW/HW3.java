package ClassHW;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 1 num: ");
        int num1 = input.nextInt();
        System.out.println("Input 2 num: ");
        int num2 = input.nextInt();
        System.out.println("Input 3 num: ");
        int num3 = input.nextInt();
        int summa = (num1 + num2 + num3) / 3;
        System.out.println(summa);
    }
}
