package JavaClass7.Abstraction;

public class MainAbstract {
    public static void main(String[] args) {
        HummingBirdChild humming = new HummingBirdChild();
       // humming.Color();
        humming.identity("Aves");
        humming.Color();
        humming.wings=2;
        humming.parents_bird();


        //  ParentClass variable=new Child();
        BirdAbstraction humming2= new HummingBirdChild();
        humming.Color();
        humming2.identity("Aves");
        humming2.wings=2;
        humming2.parents_bird();





    }


}
