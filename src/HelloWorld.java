//import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HelloWorld {
    public static void main(String[] args) {
        int alfa;
        long nr = 3245234;
        float decimal = 98.3f;
        double number = 543.75432;
        boolean flag = true;
        char c = '\u00A9';
        int[] intArray = {5, 18, 74, 2};
        boolean[] boolArray = {true, false, false, true};

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Alpha");
        stringList.add("Beta");
        stringList.add("Delta");
        stringList.add("Gamma");
        stringList.add("Alpha");

        System.out.println(stringList);

        stringList.remove(stringList.size()-1);
        System.out.println(stringList);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(6);
        integerArrayList.add(2);
        integerArrayList.add(15);
        integerArrayList.add(174);
        System.out.println(integerArrayList);
        Collections.sort(integerArrayList);
        System.out.println(integerArrayList);

        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("company", "myCompany");
        System.out.println(stringHashMap.containsKey("company"));
        System.out.println(stringHashMap.get("company"));
        System.out.println(stringHashMap);

        for (Integer integer : integerArrayList) {
            System.out.println(integer);
        }

        for (String s : stringList) {
            s += "#";
            System.out.println(s);
        }
//
//        alfa = 42;
//        alfa = 54;
//
//        String s = "He said: \"Hello Mark\"";
//        String b = " and goodbye!";
//
//        int i = 5;
//        for(i = 5; i < s.length(); i++) {
//            for (int j = 0; j < b.length(); j++) {
//            }
//            System.out.println(i);
//        }
//
//        staircase(4);
//
//        Laptop laptop  = new Laptop();
//        Laptop laptop2 = new Laptop("Apple", "MacBook", "1980x1080", 3000);
//        laptop.setModel("T580");
//
//        Laptop clone = laptop; //Clones the laptop by referencing to the same place in memory
//        clone.setPrice(1100);
//
//        Macbook macbook = new Macbook("Apple", "MacBook", "1980x1080", 3000);
//        macbook.startLaptop();
//
//        System.out.println("Laptop 1 specs:");
//        System.out.println(laptop.getModel());
//        System.out.println(laptop.getProducer());
//        System.out.println(laptop.getPrice());
//        System.out.println(laptop.getScreenResolution());
//        System.out.println();
//        System.out.println("Laptop 2 specs:");
//        System.out.println(laptop2.getModel());
//        System.out.println(laptop2.getProducer());
//        System.out.println(laptop2.getPrice());
//        System.out.println(laptop2.getScreenResolution());
//        System.out.println();
//        System.out.println("Laptop clone specs:");
//        System.out.println(clone.getModel());
//        System.out.println(clone.getProducer());
//        System.out.println(clone.getPrice());
//        System.out.println(clone.getScreenResolution());

    }

    public static double raiseToPower(int a, int power) {
        System.out.println("Raising " + a + " to power " + power);
        return Math.pow(a, power);
    }

    Object obj = new Object();

    public static double raiseToPower(int a, int b, int power) {
        return b*raiseToPower(a, power);
    }

    public static void staircase(int n) {
        System.out.println(n);
    }

}
