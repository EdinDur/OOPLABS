package org.example;

public class Task8_SecondPart {
    private static void DrawStarsPiramideUpside(int counter)
    {
        while(counter>0){
            int j=counter;
            while(j>0){
                System.out.printf("*");
                j--;
            }
            System.out.println();
            counter--;
        }
    }
    public static void main(String[] args)
    {
        DrawStarsPiramideUpside(4);
    }
}
