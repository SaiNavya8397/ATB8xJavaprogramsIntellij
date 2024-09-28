package sept.ex_25092024;

import java.util.Scanner;

public class Lab003_PrimeNumbers
{
    public static void main(String[] args) {
        System.out.println("Enter a starting position for prime number");
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Enter a ending position for prime number");
        int e=sc.nextInt();
        int count=0;
        for(int i=s;i<=e;i++)
        {
            int c=0;
            for (int j=1;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==2)
            {
                count++;
               System.out.println(i+" is prime number");
                //System.out.printf("%d,",i);
            }
        }
        System.out.println();
        System.out.println("Total prime numbers in range of " + s + " and "+ e +" = "+count);
    }
}
