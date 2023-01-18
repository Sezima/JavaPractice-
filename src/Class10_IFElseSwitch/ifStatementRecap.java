package Class10_IFElseSwitch;

import java.util.Scanner;

public class ifStatementRecap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 num: ");
        int a = sc.nextInt();
        System.out.print("2 num: ");
        int b = sc.nextInt();
        System.out.print("3 num: ");
        int c = sc.nextInt();

        if (a > b && a > c){
            System.out.println(a + " greatest number");
        } else {
            if (b > a && b > c) {
                System.out.println(b + " greatest number");
            } else {
                System.out.println(c + " greatest number");
            }

        }
    }
}
