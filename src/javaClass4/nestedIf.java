package javaClass4;

public class nestedIf {
    public static void main(String[] args) {
        int age = 18;
        boolean adult = true;

            if (age >= 18 && age < 20) {

                if (adult) {
                    System.out.println("Grown up");
                }
            }
        System.out.println("ok!");
    }
}

