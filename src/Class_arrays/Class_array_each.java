package Class_arrays;

public class Class_array_each {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 6, 78, 32};
        int s = data[0];
        for (int i : data){
            if (s > i){
                s = i;
                System.out.println("smallest: " + s);
            }

        }

    }

}
