package Class_arrays;

import java.util.Arrays;
public class Class_Arrays {
    //W
    public static void main(String[] args) {
        //Create Arrays
//        int ListOfData[] = {};
        //Access element from the array
//        System.out.println(ListOfData[2]);
//        System.out.println(ListOfData.length);
//        System.out.println(ListOfData);
//        System.out.println(Arrays.toString(ListOfData));
        int ListOfData[] = {10, 30, 50, 30, 70, 40, 45, 32};
        int s = 0;
        for (int i = 0; i < ListOfData.length; i++){
            s += ListOfData[i];
        }
        System.out.println(s);
    }
}
