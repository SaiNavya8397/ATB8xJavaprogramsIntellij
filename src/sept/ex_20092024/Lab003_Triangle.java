package sept.ex_20092024;

public class Lab003_Triangle {
    public static void main(String[] args) {
        int a=76,b=76,c=76;
        if(a==b && a==c && b==c)
            System.out.println("Equilateral");
        else if (a==b||b==c||a==c)
            System.out.println("isosceles");
        else
            System.out.println("scalene");

    }
}
