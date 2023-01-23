package Class_loop;

public class While_loop {
    // what are loops?
    //in programing pretty often
//    minimal code
    public static void main(String[] args) {

        int activeUser = 0;
        String text = "Welcome User number: ";
        /*
        () -> boolean expression / while expression is true
        */
        while (activeUser < 10){
            activeUser++;
            System.out.println(text + activeUser);
        }


    }
}
