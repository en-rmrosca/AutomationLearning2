package Alex;

import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static java.lang.Math.PI;

public class HelloWorld {

    ///////// metode functii

    // denumirea functie clasa incepe litera mica
    // raise a number to a certainpower

    public static void main(String[] args) {
        int alfa;
        long nr = 3245234;
        float decimal = 98.3f;
        double number = 543.75432;
        boolean flag = true;
        char c = '\u00A9';
        int[] intArray={5,8,8,9,10}; //fixat in demensiune

        System.out.println(intArray[0]);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Alfa");
        stringList.add("B");
        stringList.add("I");
        stringList.add("C");

        stringList.remove(1);
        System.out.println("##########");
        System.out.println(stringList.size());
        Collections.sort(stringList);
        System.out.println(stringList);
        System.out.println("##########");

        HashMap<String, String> lOOOOOStringHashMap = new HashMap<>();
        lOOOOOStringHashMap.put("Com","MayCom");

        for(String s :stringList){
            System.out.println(stringList);
//            s=s+"#";
//            s+="#";
        }


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

        double[] a = {10.1, 20, 30, 40, 50};
        int[] q = {0, 2, 4, 6};
        System.out.println(AlgorythmsImolementation.riseToPower(2,2))  ;
        System.out.println(AlgorythmsImolementation.reverseString("0123456789"));
        AlgorythmsImolementation.drawStair(16);
        System.out.println(AlgorythmsImolementation.isPalindrome("geeks"));
        System.out.println(AlgorythmsImolementation.reverse(a));
        AlgorythmsImolementation.sumPrimeNumber(q);
       System.out.println(AlgorythmsImolementation.calculatePi(10));

        System.out.println("PI = " + PI);
        double radius = 20;
        double area;
        System.out.println(area = PI * radius * radius);

//        Precision.round(Math.PI, 3);
//        DoubleRounder.round(PI, 3);


        System.out.println(AlgorythmsImolementation.round(PI, 4));

        System.out.println(AlgorythmsImolementation.roundAvoid(PI, 4));

        System.out.println(String.format("%.2f", PI));

//        String io= "0123456789";
//        int lenio= io.length();
//        String stio = io.substring(0, lenio/2);
//        String laio = io.substring(lenio/2, lenio);
//        System.out.println(stio);
//        System.out.println(laio);
    }
}
