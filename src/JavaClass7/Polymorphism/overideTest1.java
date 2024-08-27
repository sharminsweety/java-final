package JavaClass7.Polymorphism;

public class overideTest1 extends OverrideHuman {
@Override
    public void loopTest() {
        // Loop to iterate over rows
        for (int i = 1; i <= 5; i++) {
            // Loop to print stars based on the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars for the current row
            System.out.println();
        }
    }
}