package group_project7;

public class Address {
    public static void main(String[] args) {
        int startYear = 2000;
        int endDate = 2023;
        int year = 0;
        while (startYear < endDate){
            if (((startYear % 400 == 0) && (startYear % 100!= 0)) || (startYear%4 == 0)) {
                year++;
            }
            startYear++;
        }
        System.out.println(year);
    }
}
