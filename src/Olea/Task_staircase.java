package Olea;

public class Task_staircase {
    public static void main(String[] args) {

       // String sc = "#";
       // String disp_st = "";



        /* in interior la main
        System.out.println("Staircase Task");
        for (int i = 0; i < 6; i++) {
            disp_st += sc;
            System.out.println(disp_st);
        }


         */
        //staircase
        new Method_staircase().staircase(10);
        //palindrome
        if (new Method_palindrome().IsPalindrome("00"))
        {
            System.out.println("Stringul este un palindrome");
        }
        else {
            System.out.println("Stringul nu este un palindrome");
        }



//cum putem folosi variabila de acolo aici?
//daca in metod oalindrome vreau sa impart pe metode calcule, cum o fac?
//cum lucrez cu debugger?
        float[] inputArray = {(float)1,(float)2,(float)3,(float)4,(float)5,(float)6};
        new Method_inverse_array().inverseArray(inputArray);
        System.out.println("Array-ul inversat este:");
        for(int i=0;i<inputArray.length;i++)
        {
            System.out.println(inputArray[i]);
        }
//de ce permanent trebuie sa  folosesc cast?

        int[] inputBubArray = {3,2,1,2,8,3,10,30,20};
        new Bubble_sort().bubbleSortArray(inputBubArray);
        System.out.println("Array-ul sortat este:");
        for(int i=0;i<inputBubArray.length;i++)
        {
            System.out.println(inputBubArray[i]);
        }
//cum sa fac un while si cu o variabila boolean ca sa prcurgem pina cind sunt interschimbari?
        int[] inputSumAmmArray = {3,2,1,4};
        int rezultat[] = new Method_sum_amount().sumAmmount(inputSumAmmArray);
        int rezultat1 = new Method_sum_amount().sumAmmount(inputSumAmmArray)[0];
        int rezultat2 = new Method_sum_amount().sumAmmount(inputSumAmmArray)[1];

        System.out.println("Ammount " + rezultat1 + " Suma " + rezultat2);
//de experimentat cum se returneaza 2 valori
//cum de initializat tabela de-a intregul?
    }


//    public static void staircase(int i) {
//        String sc = "#";
//        String disp_st = "";
//        for (int j = 0; j < i; j++) {
//            disp_st += sc;
//            System.out.println(disp_st);
//        }
//    }
}


/*
detrminam mijlocul, lungimea stringului impartim la2
pt i <mijlocul,verificam if primul element not=ultimul element
afisam mesaj:nu este un polindrom!
 */