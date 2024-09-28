package sept.ex_27092024;

import java.util.Scanner;

public class Lab003_first5Num {
    public static void main(String[] args) {
        int e=0;
        System.out.println("Enter starting position");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("enter last position");
        int l=sc.nextInt();
        do{
            if(s%2==0){
            System.out.println(s);
           e++;
        }
s++;
    }
        while(e<l);
        System.out.println("count of even numbers :"+e);
    }
}
