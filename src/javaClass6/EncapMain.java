package javaClass6;

public class EncapMain {

    public static void main(String[] args) {
        readEncap read = new readEncap();
        System.out.println("Read "+read.getPen());


        writeEncap write = new writeEncap();
        write.setNumber(99);
//       System.out.println("number is "+write.getNumber());

        Write_Read writeRead = new Write_Read();
        writeRead.setAge(18);
        System.out.println(writeRead.getAge());


    }



}
