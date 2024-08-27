package JavaClass7.Polymorphism;

public class CalculatorOverloading {
    int  number;
    public void multiply(){
        int number1= 500;
        int number2=600;
        number = number1*number2;
        System.out.println("Multiplication1 "+number);
    }

    public  void multiply(int number1) {
        int number2 = 600;
        number = number1 * number2;
        System.out.println("Multiplication2 " + number);
    }

    public  void multiply(int number1, int number2) {
        number = number1 * number2;
        System.out.println("Multiplication3 " + number);
    }


    public static void main(String[] args) {
        CalculatorOverloading multiply1 = new CalculatorOverloading();
        multiply1.multiply();
        multiply1.multiply(550);
        multiply1.multiply(1000,2000);
    }

}
