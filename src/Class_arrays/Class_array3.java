package Class_arrays;

import java.util.Scanner;

public class Class_array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frute[] = new String[8];
        System.out.println("Enter fruit: ");
        for (int i = 0; i < frute.length; i++){
            frute[i] = sc.nextLine();
        }
        System.out.println("Dub: ");
        for (int i = 0; i< frute.length; i++){
            for (int j = i + 1; j < frute.length; j++){
                if (frute[i].equals(frute[j])){
                    System.out.println(frute[j]);
                    break;



                }
            }

        }




    }
}
