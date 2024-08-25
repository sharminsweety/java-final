package javaClass4;


public class methodTest
{
    public static void main(String[] args) {

        methodPractice.namePrint();

        methodPractice test = new methodPractice();
        System.out.println("Print non void message"+ test.divideNo());
        test.printNumber();
        methodPractice test2 = new methodPractice();
        System.out.println("Void Method with parameter" + test2.substractNo(20,25));
    }

}
