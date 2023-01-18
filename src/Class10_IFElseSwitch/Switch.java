package Class10_IFElseSwitch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
      /*
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        String a = "fdo";

        switch (day){
            case 1: case 3: case 5: case 7: case 8:  case 10:   case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28/29 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;

            default:
                System.out.println("Bad");
                 }

*/

        Scanner sc = new Scanner(System.in);
        double spend = sc.nextInt();

        if (spend < 0) {
            System.out.println("bad");
        } else {


            switch ((int) spend) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("$" + spend * 0.05);
                    break;

                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("$" + spend * 0.1);
                    break;

                default:
                    String destination = sc.next();
                    switch (destination) {
                        case "USA":
                            System.out.println("$" + spend * 0.1);
                            break;
                        case "Canada":
                            System.out.println("$" + spend * 0.15);
                            break;
                        case "Europe":
                            System.out.println("$" + spend * 0.20);
                            break;
                        default:
                            System.out.println("$" + spend * 0.25);

                    }


            }
        }

    }
}
