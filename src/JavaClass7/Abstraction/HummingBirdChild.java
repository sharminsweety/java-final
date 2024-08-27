package JavaClass7.Abstraction;

public class HummingBirdChild extends BirdAbstraction{


 int bird_no;
    @Override
    public void Color() {
        String [] color={"Red", "White", "Blue"};
                for (String i:color)
                {
                    if(i.equals("White"))
                    {
                        System.out.println("It's a humming bird!");
                    }
                }

    }
}
