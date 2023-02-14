package Class_arrays;

import java.util.Scanner;

public class Class_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = new int[3][3];
        for (int i = 0; i < data.length; i++){
            int g = 0;

            System.out.println("Row: " + (i + 1));
            for (int j = 0; j < data[i].length; j++){
                data[i][j] = sc.nextInt();
                if(g< data[i][j]){
                    g = data[i][j];

                }

            }
            System.out.println("row: " + (i + 1) + " - "+g);
        }
    }
}
