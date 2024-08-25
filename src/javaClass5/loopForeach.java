package javaClass5;

public class loopForeach
{
    public static void main(String[] args) {
        int [] number = {2,18,10,12,18};
        int sum=0;
        for (int x:number)
        {
            sum =sum+x;
           // System.out.println(sum);
        }
         System.out.println(sum);

    }
}
