package ClassHW;

import java.util.Scanner;

public class HW15_loopFor {
    public static void main(String[] args) {
//        1
//        int sum = 0;
//        for (int i = 1; i <= 10; i++){
//            if (i%2==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);


//        2
//        Scanner input = new Scanner(System.in);
//        int userNum = input.nextInt();
//        int count = 0;
//        for (int a = 1; a <= userNum; a++){
//            if (userNum % a == 0){
//                count += 1;
//
//            }
//        }
//        System.out.println(count);


//        3

        for (int i = 1; i <= 100; i++){
            if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1){
                System.out.println(i);
            }
        }




//        4

//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            if (i % 3 == 0) {
//                sum -= i;
//
//            } else {
//                sum += i;
//            }
//        }
//        System.out.println(sum);


//        5

//int sum = 0;
//        int j = 0;
//        for (int i = 10; i > 5; i--) {
//            j++;
//            System.out.print(i);
//            System.out.print(" + ");
//            System.out.print(j);
//            System.out.print(" + ");
//            sum += j;
//            sum += i;
//        }
//        System.out.println(sum);


    }
}
