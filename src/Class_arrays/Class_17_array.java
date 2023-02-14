package Class_arrays;

public class Class_17_array {
    public static void main(String[] args) {
        int data[][] = {
                {3, 5, 7},
                {5, 7, 2},
                {6, 3, 1}
        };
        int s = 0;
        for (int i = 0; i < data.length; i++){
            int sum = 0;
            for (int j = 0 ; j < data[i].length; j++){
                System.out.print(data[i][j] + " ");
                sum = sum + data[i][j];



            }

            System.out.println();
            System.out.println("Sum of row " + (i + 1 ) + " = " + sum);

        }

    }

}
