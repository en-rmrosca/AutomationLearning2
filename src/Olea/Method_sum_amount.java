package Olea;

public class Method_sum_amount {
    public int[] sumAmmount(int[] inputSumAmmArray){
        int suma=0;
        int ammount=0;
        int[] rezultat={0,0};
        System.out.println(" ");
        System.out.println("TASKUL SUM AMMOUNT ARRAY pentru array-ul: ");
        for (int i=0;i<inputSumAmmArray.length;i++)
        {
            System.out.println(inputSumAmmArray[i]);
        }

        for (int i=0;i<inputSumAmmArray.length;i++)
        {
            int restulImp = inputSumAmmArray[i] % 2;
            if (restulImp ==0)
            {
             ammount+=1;
            }
            else
            {
             suma+=inputSumAmmArray[i];
            }
        }

      rezultat[0]=ammount;
      rezultat[1]=suma;
      return rezultat;
    }
}
