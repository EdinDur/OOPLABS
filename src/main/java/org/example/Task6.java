package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("How many times do you want to print text: ");
        int read=Integer.parseInt(reader.nextLine());
        printText(read);
    }
    public static void printText(int read) {
        while (read > 0) {
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
            read--;
        }
    }
}
