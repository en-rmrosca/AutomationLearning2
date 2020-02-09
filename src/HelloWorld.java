import Alex.Algorythms;
import java.lang.*;
import java.io.*;
import java.util.*;

public class HelloWorld {

    ///////// metode functii

    // denumirea functie clasa incepe litera mica
    // raise a number to a certainpower
    public static double riseToPower(int a, int power){
        return Math.pow(a,power);
    };

    public static String drawStair(int a){
        String s ="";
        for(int b = 0;b<a;b++ ){
            s=s+"#";
            System.out.println(s);
        }
        return s;
    }

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    static String isPalindrome(String str){

        for(int i=0, j = str.length() - 1;i < j;i++,j--){
            if (str.charAt(i) != str.charAt(j))
                return "false";
        }
        return "true";
    }


    public static void main(String[] args) {
        int alfa;
        long nr = 3245234;
        float decimal = 98.3f;
        double number = 543.75432;
        boolean flag = true;
        char c = '\u00A9';

        alfa = 42;
        alfa = 54;

        String s = "He said: \"Hello Mark\"";
        String b = " and goodbye!";

        int i = 5;
        for(i = 5; i < s.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
            }
            System.out.println(i);
        }

        System.out.println(riseToPower(2,2))  ;
        System.out.println(reverseString("0123456789"));
        System.out.println(drawStair(16));
        System.out.println(isPalindrome("geeks"));


//        String io= "0123456789";
//        int lenio= io.length();
//        String stio = io.substring(0, lenio/2);
//        String laio = io.substring(lenio/2, lenio);
//        System.out.println(stio);
//        System.out.println(laio);





    }



}
