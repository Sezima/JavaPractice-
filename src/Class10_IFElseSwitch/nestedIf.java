package Class10_IFElseSwitch;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: Main Course");
        System.out.println("2: Appetizer");
        String user = sc.nextLine();
        if (user.equals('1') || user.equals("Main Course")) {
            System.out.println("1: Spring roll");
            System.out.println("2: Egg roll");
            String ch = sc.nextLine();
            if (ch.equals("1") || ch.equals("Spring roll")) {
                System.out.println("Spring Roll ingredients");
            } else System.out.println("Spring Roll ingredients");


        } else {
            System.out.println("1: lagman");
            System.out.println("2: New York Rib Eye steak ");
            String ch2 = sc.nextLine();
            if (ch2.equals('1') || ch2.equals("lagman")) {
                System.out.println("lagman");
            } else {
                System.out.println("New York Rib Eye steak ingredients");
            }

        }
    }
}
