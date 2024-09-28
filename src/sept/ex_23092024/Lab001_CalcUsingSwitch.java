package sept.ex_23092024;

import java.util.Scanner;

public class Lab001_CalcUsingSwitch {
    public static void main(String[] args) {
        double a=16.4;
        double b=23.4;
        System.out.println("Enter String:");
        Scanner sc=new Scanner(System.in);
        String op=sc.nextLine();
        switch(op)
        {

            case ("Add") :
                System.out.println((a+b));
                break;
            case ("Sub"):
                System.out.println((a-b));
                break;
            case ("Div"):
                System.out.println((a*b));
                break;
            case("Mult"):
                System.out.println((a/b));
                break;
            case("Mod"):
                System.out.println((a%b));
                break;
            default:
                System.out.println("No operation");
        }
    }
}
