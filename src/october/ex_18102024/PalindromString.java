package october.ex_18102024;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        System.out.println("Enter a String to reverse : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String store=str;
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
        if(str.equals(revstr))
        {
            System.out.println("Palindrom String");
        }
        else
            System.out.println("not a palindrome string");
    }

}
