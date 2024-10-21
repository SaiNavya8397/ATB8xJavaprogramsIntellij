package october.ex_18102024;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a String to reverse : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len=0;
        String revstr="";
        char[] ch=str.toCharArray();
        for(char c:ch)
        {
            len++;
        }
        System.out.println(len);
        for(int i=len-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        System.out.println(revstr);
    }
}