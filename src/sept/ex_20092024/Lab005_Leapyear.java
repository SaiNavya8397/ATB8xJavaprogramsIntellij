package sept.ex_20092024;

public class Lab005_Leapyear {
    public static void main(String[] args) {
        int i=2018;
        if (i%4==0 && i%100!=0||i%400==0)
            System.out.println("It's a Leap Year");
        else
            System.out.println("It's not a Leap Year");
    }
}
