package sept.ex_27092024;

import java.util.Scanner;

public class Lab004_SumOfNum {
    public static void main(String[] args) {
        System.out.println("Enter a starting position:");
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Enter last position:");
        int l=sc.nextInt();
        int res=0;
        int f=s;
        while(s<=l)
        {
            res=res+s;
            s++;
        }
        System.out.println("sum of "+ f +" and "+l+" is = "+res);
    }
}
