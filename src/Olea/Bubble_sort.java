package Olea;

public class Bubble_sort {
    public int[] bubbleSortArray(int[] inputBubArray)
    {
        int auxiliar;
        System.out.println(" ");
        System.out.println("TASKUL BUBBLE SORT pentru array-ul: ");
        for (int i=0;i<inputBubArray.length;i++)
        {
            System.out.println(inputBubArray[i]);
        }

        for (int i=0;i<inputBubArray.length-1;i++)
        {
            for(int j=0;j<inputBubArray.length-1;j++)
            {
                if (inputBubArray[j]>inputBubArray[j+1])
                {auxiliar=inputBubArray[j];
                inputBubArray[j]=inputBubArray[j+1];
                inputBubArray[j+1]=auxiliar;
                }
            }
        }
        return inputBubArray;
    }
}
