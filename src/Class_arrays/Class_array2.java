package Class_arrays;

import java.util.Scanner;

public class Class_array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lists[] = new String[5];
        for (int i = 0; i < 5; i++){
            lists[i] = sc.nextLine();
            System.out.println(lists[i].length());
        }

    }
}
