package Alex;

//https://confluence.endava.com/display/TAP/Problem+Solving

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;


public class AlgorythmsImolementation {

    public static double riseToPower(int a, int power){
        return Math.pow(a,power);
    };

    public static void drawStair(int a){
        String s ="";
        for(int b = 0;b<=a;b++ ){
            s=s+"#";
//            s+="#"
            System.out.println(s);
        }
        System.out.println("#");
        //return s;
    }

    public static String isPalindrome(String str){

        for(int i=0, j = str.length() - 1;i <= j;i++,j--){
            if (str.charAt(i) != str.charAt(j))
                return "false";
            }
        return "true";
        }

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

//    3	Given an array of floating point numbers, inverse the elements of the array
    public static double[] reverse(double[] array) {
        System.out.println("array before reverse: " + Arrays.toString(array) );

        for(int p=0; p<array.length/2; p++){
            double temp = array[p];
            array[p] = array[array.length -p -1];
            array[array.length -p -1] = temp;
        }
//        return Arrays.toString(array);
        return array;
    }

//    4	Given an array of integers, implement the BubbleSort algorithm for sorting the elements of the array
    public static int[] BubbleSort(int[] array){
        int i,j, temp = 0;
        for(i=0; i<array.length-1; i++){
//            int num =array[i];
            for(j=array.length-1; j>i ;j--){
//                int leftNum =array[j];

                if(array[j] < array[j-1]){
                    temp=array[j];
                    array[j]= array[j-1];
                    array[j-1] =temp;
                }
            }
        }
    return array;
    }

//    5	Given an array of integers, determine the sum of odd numbers and the amount of even numbers
    public static void sumPrimeNumber(int[] array){
        int i, evenSum = 0, oddSum = 0, evenCount=0, oddCount=0;
        for(i=0; i<array.length; i++) {
            //System.out.println(array[i]);

            if(array[i] % 2 == 0)
            {
                evenSum = evenSum + array[i];
//                System.out.println("evenSum"+array[i]+evenSum);
                evenCount=evenCount+i;
            }
            else
            {
                oddSum = oddSum + i;
//                System.out.println("oddSum"+array[i]+oddSum);
                oddCount=oddCount+i;
            }
        }
        System.out.println("evenSum::"+evenSum);
        System.out.println("oddSum::"+oddSum);
    }


//    6	Given an integer n, determine the number pi with an error less than n decimal places
    public static double calculatePi(int val) {
        System.out.println("PI = " + Math.PI);

        for (int d = 1; d <= 400000; d += 4) {
            val += 1 / d;
            val -= 1 / (d + 2);
        }
        return val*4;
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal nr = new BigDecimal(Double.toString(value));
        nr = nr.setScale(places, RoundingMode.HALF_UP);
        return nr.doubleValue();
    }



//    Write a program that will check if a two-dimensional arrays is magical square or not
//    https://en.wikipedia.org/wiki/Magic_square
//
//    Given an integer n, determine all prime numbers smaller than n
//
//    Given an integer n, determine all friendly number pairs smaller than n
//    https://en.wikipedia.org/wiki/Friendly_number
//
//    Write a program that outputs the next k leap years
//    https://en.wikipedia.org/wiki/Leap_year
//
//    Given three ascendingly sorted arrays, merge the elements of these three arrays to obtain one ascendingly sorted array
//    Given following arrays:
//            1 5 5
//            2 6 7
//            1 4 7 8
//    The output should be:
//            1 1 2 4 5 5 6 7 7 8
//
//    Given a matrix of integers with size n*n, sort the lines of the matrix by the sum of the elements on those lines
//
//    Write a function that rotates a list by k elements. For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2]. Try solving this without creating a copy of the list
//
//    Given a list of coins with different values (1, 3, 10, 25, 50), determine the minimum amount of coins needed to sum up a certain amount of money

    }
