package Class_loop;

import java.util.Scanner;

public class loop_withChirag {
    public static void main(String[] args) {
        int i = 1;
//        while (i >= 5){
//            System.out.println(i);
//            i++;
//        }

        Scanner sc = new Scanner(System.in);

        String str = "";



        do {
            System.out.println("Enter num: ");
            int num = sc.nextInt();
            num *= num;
            System.out.println(num);
            System.out.println("Do you want to repeat? ");
            String s = sc.next();
            str = s;


        } while (!str.equals("no"));








    }
}
