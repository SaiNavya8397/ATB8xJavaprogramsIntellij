package Patterns;

import java.util.Scanner;

public class Starr1 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=i;j<row;j++) {
                System.out.print("_");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
