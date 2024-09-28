package sept.ex_27092024;

import java.util.Scanner;

public class Lab002_doWhile {
    public static void main(String[] args) {
        //print 1 to 5 numbers
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            System.out.println(n);
            n++;
        }
        //while(n<10);
        while(n<1);//even though 5<1 condition false also do loop will exexute one time
    }
}
