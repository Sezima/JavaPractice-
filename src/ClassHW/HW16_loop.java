package ClassHW;

import java.util.Scanner;

public class HW16_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        int sum = 0;
        int max = num % 10;

        while (num>0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
//            greaater
            if (lastDigit > max){
                max = lastDigit;
            }
            num = num / 10;
        }
        System.out.println(sum);
        System.out.println(max);
    }
}
