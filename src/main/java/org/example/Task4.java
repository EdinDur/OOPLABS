package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.printf("First: ");
        int first=Integer.parseInt(reader.nextLine());
        System.out.printf("Last: ");
        int last=Integer.parseInt(reader.nextLine());
        while(first<=last)
        {
            System.out.println(first);
            first++;
        }


    }

}
