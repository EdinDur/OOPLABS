package org.example;

public class Task7 {

    private static void printStars(int counter){
        while(counter>0)
        {
            System.out.printf("*");
            counter--;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
