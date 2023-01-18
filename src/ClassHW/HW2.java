package ClassHW;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Java exercises  are you solving per day?: ");
        int exercises = input.nextInt();
        if (exercises < 3 ) {
            System.out.println("You are too lazy!");
        }
        if (exercises >= 3 && exercises < 5) {
            System.out.println("Good job, but you should do better!");
        }
        if (exercises >= 5){
            System.out.println("Great job! You are on the right track! ");
        }
    }
}
