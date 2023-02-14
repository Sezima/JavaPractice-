package ClassHW;

import java.util.Scanner;

public class HW_array_2_3 {
    /*
    4. Write a program to sort array elements in ascending order
    Input: 5 2 8 7 1
    Output: 1 2 5 7 8
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lists[] = new int[10];
        System.out.println("Enter numbers: ");



        for (int i = 0; i < 10; i++){
            lists[i] = sc.nextInt();
        }

        for (int i = 0; i < lists.length; i++){
            if(i % 2 != 0){
                System.out.print(lists[i] + " ");
            }
        }

    }
}
