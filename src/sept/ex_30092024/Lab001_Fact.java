package sept.ex_30092024;

import java.util.Scanner;

public class Lab001_Fact {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=1;
        for (int i = n; i >=1; i--) {
            if(n==i)
                System.out.print(i);
            else {
                System.out.print("*" + i);
            }
            res=res*i;
        }
        System.out.println("="+res);
    }
}
