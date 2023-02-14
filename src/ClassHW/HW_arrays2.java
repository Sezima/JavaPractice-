package ClassHW;

import java.util.Scanner;

public class HW_arrays2 {
    public static void main(String[] args) {
        int s = 0;
        int n = 0;
        int nums[] = {12, -45, 67, 23, -13, 45, -56};
        for(int i = 0; i < nums.length; i++ ){
            if (nums[i] > 0){
                s++;
            } else {
                n ++;
            }

        }
        System.out.println("Positive: : " + s);
        System.out.println("Negative: " + n);
    }
}
