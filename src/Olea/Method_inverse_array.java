package Olea;

public class Method_inverse_array {
    public float[] inverseArray(float[] inputArray){
        System.out.println(" ");
        System.out.println("TASKUL INVERSE ARRAY pentru array-ul: ");
        for (int i=0;i<inputArray.length;i++)
        {
            System.out.println(inputArray[i]);
        }

        float auxiliar;
        float mijlArray = (float)inputArray.length / 2;

        for (int i=0;i< mijlArray;i++){
            auxiliar = inputArray[i];
            inputArray[i]=inputArray[inputArray.length-i-1];
            inputArray[inputArray.length-i-1]=auxiliar;
        }
        return inputArray;
    }
}
