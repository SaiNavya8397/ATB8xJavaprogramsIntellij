package sept.ex_25092024;

import java.util.Scanner;

public class Lab002_Factorial {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            int res=1;
            for (int i = 1; i <=n; i++) {
                if(i==1)
                    System.out.print(i);
                else {
                    System.out.print("*" + i);
                }
                res=res*i;
            }
            System.out.println("="+res);
    }
}
