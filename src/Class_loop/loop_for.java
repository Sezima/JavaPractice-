package Class_loop;

import java.util.Scanner;

public class loop_for {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--){
            System.out.println(i);

        }

        System.out.println("================================");

        for (int n = 1; n <=10; n++){
            System.out.println(n);
            System.out.println("-----");
            System.out.println(n+1); //выводит но не сохраняет
        }
        System.out.println("=============task 3===========");
        int i;
        for (i=1; i <= 10; i++){
            i = i + 2;
            System.out.println(i);

        }


//
        System.out.println("================");
        int s = 0;
        for(int num = 0; num < 5; ){
            num++;
            s += num;
        }
        System.out.println(s);

        System.out.println("=============new=============");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num2 = input.nextInt();

        for (int sem = 1; i < num2; sem++){
            num2--;
            if (num2%sem==0){
                System.out.println(num2);
            }
        }

    }
}
