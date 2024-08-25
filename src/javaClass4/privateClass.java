package javaClass4;

public class privateClass {
    public void pubMethod()
    {
        String name= "Sweety";
        System.out.println(name);

    }

    private void printName()
    {
        int a= 5;
        int b=10;
        int age ;
        age = a+b;
        System.out.println("Age "+ age);
    }

    public static void main(String[] args) {
        privateClass test= new privateClass();
        test.pubMethod();
        //System.out.println();
        test.printName();
    }
}



