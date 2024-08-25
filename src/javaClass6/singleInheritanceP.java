package javaClass6;

public class singleInheritanceP {
    int mark;

    public void markCount(int number1, int number2) {
        mark = number1 + number2;
        System.out.println("Eng1 and Eng2 paper mark "+ mark);
    }

    public void  resultPublish( ) {

        if (mark == 80) {
            System.out.println("A+");;
        }
        else
        {
            System.out.println("A");
        }
       // return mark;
    }
   public void promotionClass(String status) {

       if ("promoted".equals(status)) {
           System.out.println("Promoted!congo");
       } else {
           System.out.println("Not Promoted!");
       }

   }

}

