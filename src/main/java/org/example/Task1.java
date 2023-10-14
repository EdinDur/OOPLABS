package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        String password="carrot";
        String inpPassword;
        boolean controler=true;
        while(controler)
        {
            System.out.printf("Type the password: ");
            inpPassword=reader.nextLine();
            if(inpPassword.equals(password))

            {
                System.out.println("Right!");
                System.out.println();
                System.out.println("The secret is: jryy qbar!");
                controler=false;
            }
            else
            {
                System.out.println("Wrong!");
            }
        }
    }
}
