package javaClass6;

public class mainSingle {
    public static void main(String[] args) {
        singleChild num1= new singleChild();
        num1.markCount(30,50);
        num1.resultPublish();
        num1.promotionClass("");
        num1.greatSchool();

        inhChild1 num2 = new inhChild1();
        num2.markCount(80,10);
        num2.resultPublish();
        num2.promotionClass("promoted");
        num2.greatSchool();
        num2.testAgain("Multiple inheritance");

        System.out.println();
    }
}
