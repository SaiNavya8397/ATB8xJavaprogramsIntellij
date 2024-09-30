package sept.ex_30092024;

import java.util.Scanner;

public class Lab003_Vow_Cons {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0,i=0;
        int length=s.length();
        System.out.println("length of String : "+length);
        while(i<length)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u'||
                    s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                v++;
            }
            else{
                c++;}
            i++;
        }
        System.out.println("vowels count "+v);
        System.out.println("consonants count "+c);
}}
