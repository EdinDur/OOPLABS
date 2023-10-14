package org.example;

public class Task8 {
    private static void drawStarsPiramid(int counter){
        int i=1;
        while(i<=counter)
        {
            int j=i;
            while(j>0) {
                System.out.printf("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args){
        drawStarsPiramid(3);
    }
}
