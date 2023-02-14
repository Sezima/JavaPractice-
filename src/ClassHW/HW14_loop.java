package ClassHW;

public class HW14_loop {
//    Write a program that calculates the sum of all even numbers between 1 and a 100 using a while loop.
//2+4+6+8 … = ?
//        2. Write a program that prints all prime numbers between 1 and a 100  using a while loop.


    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        while ( a < 100) {
            a++;
            if (a % 2 == 0){
                sum += a;
                System.out.println(a);

            }

        }
        System.out.println(sum);
    }




}
