package Class10_IFElseSwitch;

import java.util.Scanner;

public class SwitchPart2 {
    public static void main(String[] args) {
        System.out.println("Yes/give up/no: ");
        Scanner sc = new Scanner(System.in);
        String love = sc.next();
        switch (love) {
            case "yes":
                System.out.println("Just do it");
                break;
            case "GIVE UP":
                System.out.println("Don't give up");
                break;
            case "no":
                System.out.println("oh nooooo");
                break;
        }
        //        boolean a = trouble(6, false);
        //        System.out.println(a);
    }


//1

    //        public static boolean trouble(int hour, boolean isParrot){
    //            if (isParrot) {
    //                if (hour <= 7 || (hour > 20 && hour <= 24)) {
    //                    return true;
    //                } else {
    //                    return false;
    //                }
    //            } else {
    //                return false;
    //            }
    //        }



//    2

        /*
    We have a loud talking parrot.
    Create a function that will tell us
    if we are in trouble or not based on the hour and based on if the parrot is talking.
    The "hour" is the current hour time in the range 1..24.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    Return true if we are in trouble.
        */

//        public static boolean sleepIn(String week, Boolean vacation) {
//        if ((week == "sunday" || week == "saturday") || (vacation != false)) {
//            return true;
//        } else {
//            return false;
//        }
    }


