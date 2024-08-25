package javaClass4;

public class ifElseladder
{

    public static void main(String[] args) {
        int price= 100;

        if (price >=90 && price <150)
        {
            System.out.println("Expensive");
        }else if(price>90 || price <150)
        {
            System.out.println("Price is alright");
        }

        else if (price<10)
        {
            System.out.println("test");
        }
        else if (price>50 && price <150)
        {

            System.out.println("Cheap");

        }/*else
        {
            System.out.println("Unpredictable");
        }*/
        System.out.println("Code done Sweety!");
    }
}
