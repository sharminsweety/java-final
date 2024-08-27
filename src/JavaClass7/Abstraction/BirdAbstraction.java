package JavaClass7.Abstraction;

public abstract class BirdAbstraction {

   int wings;
    public void identity (String Species){

        System.out.println("Bird Species is "+ Species);

    }

    public abstract void Color();

    public void parents_bird ()
    {
        int age = 3;
        if (age==3) {
            System.out.println("Parents bird");
        } else if (age>3) {
            System.out.println("Grown up");
            
        } else if (age>2) {
            System.out.println("Child");

        }else
        {
            System.out.println("Adult");
        }








    }

    }


