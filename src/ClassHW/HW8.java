package ClassHW;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: Main Course");
        System.out.println("2: Appetizer");
        String user = sc.nextLine();
        if (user.equals("1") || user.equals("Main Course")) {
            System.out.println("1: Spring roll");
            System.out.println("2: Egg roll");
            String ch = sc.nextLine();
            if (ch.equals("1") || ch.equals("Spring roll")) {
                System.out.println("Spring Roll ingredients");
            } else {
                if (ch.equals("2") || ch.equals("Egg Rolle")) {
                    System.out.println("Egg Roll ingredients");
                } else {
                    System.out.println("Invalid Choice on Main Course");
                }


            }
        } else {
            System.out.println("1: lagman");
            System.out.println("2: New York Rib Eye steak ");

            String ch2 = sc.nextLine();
            if (ch2.equals("1") || ch2.equals("lagman")) {
                System.out.println("lagman");
            } else {
                if (ch2.equals("2") || ch2.equals("New York Rib Eye steak")) {
                    System.out.println("New York Rib Eye steak ingredients");
                } else {
                    System.out.println("Invalid Choice Appetizer");
                }

            }
        }


        System.out.println("Apple juice\n" + "Orange juice\n" + "Pineapple juice");
        String j = sc.nextLine();
        if (j.equals("Apple juice")) {
            System.out.println("Apple juice ingredients.");
        } else {
            if (j.equals("Orange juice")) {
                System.out.println("Orange juice ingredients.");
            } else {
                if (j.equals("Pineapple juice")) {
                    System.out.println("Pineapple juice ingredients.");
                } else {
                    System.out.println("Invalid juice choice.");
                }


            }
        }


        Scanner scan = new Scanner(System.in);
        System.out.print("Pls enter shipping country: ");
        String country = scan.nextLine();
        System.out.print("Pls enter weight of your item in lbs: ");
        double weight = scan.nextDouble();

        if (country.equalsIgnoreCase("United States")) {
            if (weight < 2) System.out.println("This is cost is 5$");
            else {
                if (weight >= 2) {
                    double cost = (weight * 0.5d);
                    System.out.println("The shipping cost is " + (int) cost + "$");
                }
            }
        } else {
            double cost = weight * 1.5d;
            System.out.println("The shipping cost is " + (int)cost + "$");
        }


//        2

        Scanner inp = new Scanner(System.in);
        System.out.println("Loan: ");
        int loan = inp.nextInt();
        System.out.println("credit: ");
        int credit = inp.nextInt();

        if (loan < 10000) {
            if (credit < 600) System.out.println("15%");
            else
            if (credit == 600) System.out.println("10%");
        } else
        if (loan == 10000 && credit < 600) System.out.println("12%");
        else System.out.println("8%");





    }
}
