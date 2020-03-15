package Olea;

public class Method_palindrome {
    public boolean IsPalindrome(String  stPal) {

        System.out.println(" ");
        System.out.println("TASKUL PALINDROME pentru stringul " + stPal);

        boolean flag = true;
//convertim string to array
        char[] ch = stPal.toCharArray();
//determinam restul impartirii
        int restulImp = ch.length % 2;


            if (restulImp == 0) {
//determinam mijlocul array-ului
                float mijlArray = (float)ch.length / 2;

                for (int i = 0; i < mijlArray; i++) {
                    if (ch[i] != ch[ch.length - i - 1]) {
                        flag = false;
                    }
                }
            }
            else {
                flag = false;
            }

        return flag;
    }
}
