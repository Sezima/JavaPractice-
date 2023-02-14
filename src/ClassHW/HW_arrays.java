package ClassHW;

public class HW_arrays {
    public static void main(String[] args) {
        int s = 0;
        int nums[] = {12, 45, 67, 23, 13, 45, 56};
        for(int i = 0; i < nums.length; i++ ){
            if (nums[i] > s){
                s *= 0;
                s+=nums[i];
            }

        }
        System.out.println(s);
    }
}
