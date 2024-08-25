package javaClass5;


public class oldLoop1 {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if (i > 5) {
                if(i<15)
                {
                    System.out.println(i);
                    break;
                }
                //System.out.println("i in for"+i);
            }
            //System.out.println(i);
        }
    }

}
