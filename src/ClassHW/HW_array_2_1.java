package ClassHW;

import java.util.Scanner;

public class HW_array_2_1 {
    //2.  Write a program to find the duplicate elements from the array (The element should not be repeated in the output ) - Brainstorm to find the logic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lists[] = new int[10];
        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            lists[i] = sc.nextInt();
        }

        System.out.println("Dub: ");
        for (int i = 0, j = i + 1; i < lists.length && j < lists.length; i++, j++) {
            if (lists[i] == lists[j]) {

                System.out.print(lists[j] + " ");
            }
        }
    }
}
