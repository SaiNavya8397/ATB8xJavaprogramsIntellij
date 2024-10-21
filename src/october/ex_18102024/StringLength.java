package october.ex_18102024;


import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        System.out.println("Enter a String to check the length : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1=str;
        char[] ch = str.toCharArray();
/*with using length mwthod
        //System.out.println(str.length()); //using length function
        //System.out.println(ch.length); //converted to char array and used length method*/

        //without using length method
        int c = 0, z = 0, k;
        str = str + '\0';
        for (int i = 0; str.charAt(i) != '\0'; i++) {
            c++;
        }
        System.out.println("Length of the String is : " + c);

        for (char co : ch) {
            z++;
        }
        System.out.println("Length of the String ater converting it to char Array is : " + z);

        k=str1.lastIndexOf("");
        System.out.println(k);
    }

}
