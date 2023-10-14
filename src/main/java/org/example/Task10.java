package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task10 {

    private static void drawNumber(){
        Random rand=new Random();
        int randNumber = rand.nextInt(101);
        Scanner reader=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a number");
            int number=Integer.parseInt(reader.nextLine());
            if(number==randNumber)
            {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else if(number>randNumber)
            {
                System.out.println("The number is lesser");
            }
            else{
                System.out.println("The number is greater");
            }
        }
    }
    public static void main(String[] args)
    {
        drawNumber();
    }
}
