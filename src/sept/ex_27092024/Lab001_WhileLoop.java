package sept.ex_27092024;

import java.util.Scanner;

public class Lab001_WhileLoop {
    public static void main(String[] args) {
        //sum of digits of a num
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0, res=0;
        while(n>0)
        {
            //System.out.println("fghjkl");
            i=n%10;
            System.out.print("+"+i);
            res=res+i;
            n=n/10;
        }
        System.out.println("=" +res);
    }
}
