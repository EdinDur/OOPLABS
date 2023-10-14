package org.example;

public class Task9_SecondPart {
    private static void drawNumbersPiramid(int counter){
        int i=1;
        while(i<=counter)
        {
            int j=i;
            while(j>0) {
                System.out.printf("%d",i);
                j--;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args){
        drawNumbersPiramid(10);
    }
}
