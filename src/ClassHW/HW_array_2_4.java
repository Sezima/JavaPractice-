package ClassHW;

public class HW_array_2_4 {
    public static void main(String[] args) {
        int list[] = {5, 2, 8, 7, 1};
        int s;
        for (int i = 0; i < list.length; i++){
            for (int j = i + 1; j < list.length; j ++){
                if(list[i] > list[j]){
                    s = list[i];
                    list[i] = list[j];
                    list[j] = s;
                }

            }

        }
        for (int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
    }
}

