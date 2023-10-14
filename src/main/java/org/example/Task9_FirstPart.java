package org.example;

public class Task9_FirstPart {
    private static void drawNumbersPiramid(int counter){
        int i=1;
        while(i<=counter)
        {
            int j=1;
            while(j<=i) {
                System.out.printf("%d",j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args){
        drawNumbersPiramid(10);
    }
}