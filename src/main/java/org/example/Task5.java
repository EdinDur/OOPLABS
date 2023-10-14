package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        System.out.printf("Type a number: ");
        int read=Integer.parseInt(reader.nextLine());
        int sum=0;
        while(read>=0)
        {
            sum=sum+(int)Math.pow(2,read);
            read--;
        }
        System.out.println("The result is: "+sum);
    }
}
