package ClassHW;

import java.util.Scanner;

public class HW12_string {
    /*
    Homework 1:
    Write a method that takes a string and returns true if the string starts with “hi” and false otherwise.


    Homework 2:
    Write a method that takes a string   returns a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
    extraEnd(“Hi”) → “HiHiHi”
    extraEnd(“Hello”) → “lololo”
    extraEnd(“ab”) → “ababab”


    Homework 3:
    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so “coding” yields “codign”.
    lastTwo(“coding”) → “codign”
    lastTwo(“cat”) → “cta”
    lastTwo(“ab”) → “ba”
    */

    //1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Sezim";
        String c = "hi world!";
        String word = "";
        String n = "coding";
        System.out.println(StringStartWith(a));
        System.out.println(StringStartWith(c));
        System.out.println(RepeatWord(word));
        System.out.println(ChangeWord(n));


    }


        public static Boolean StringStartWith (String a){
            if (a.startsWith("hi")) {
                return true;

            } else {
                return false;
            }
        }



//        2

    public static String RepeatWord(String a) {
//        extraEnd(“Hello”) → “lololo”


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();


        if (word.length() >= 2) {
            String newword = "";
            newword = (word.substring(word.length() - 2)) + (word.substring(word.length() - 2)) + (word.substring(word.length() - 2));
            return newword;

        }
        return word;
    }

//    3


    public static String ChangeWord(String n) {
        if (n.length() >= 2) {
            return n = n.substring(0, n.length()-2) + n.charAt(n.length()-1) + n.charAt(n.length()-2);
        } else {
                return n;
            }
        }
    }








