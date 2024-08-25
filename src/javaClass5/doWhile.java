package javaClass5;

public class doWhile {
    public static void main(String[] args) {
        int mark = 80;
        int count=0;
        do {
            System.out.println("A+");
            //mark = mark + 5;
            mark++;
            count++;
        }
        while (mark <=100);
        System.out.println("Total A+ printed "+count);

        }
    }

