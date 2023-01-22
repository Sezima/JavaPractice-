package ClassHW;

import java.util.Scanner;

public class HW11_leapyear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        System.out.println(leapyear(year));
    }

    public static boolean leapyear(int year) {

        if (((year % 400 == 0) && (year % 100!= 0)) || (year%4 == 0))
            return true;
        else{
            return false;
        }


    }
}
