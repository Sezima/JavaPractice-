package Class_arrays;

import java.util.Scanner;

public class Class2DArray {
    public static void main(String[] args) {
        int data[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ;  i < data.length; i++){
            System.out.println("Enter 3 number for row: " + (i + 1));
            int g = 0;
            for (int j = 0; j < data[i].length; j++){
                data[i][j] = sc.nextInt();
                int s = data[i][j];
                if (s > data[i][j]){
                    System.out.println("dretest: " + s);
                }
            }
        }
    }


}
