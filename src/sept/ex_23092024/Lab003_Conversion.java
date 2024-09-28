package sept.ex_23092024;

import java.util.Scanner;

public class Lab003_Conversion {
    public static void main(String[] args) {
        //converting km to meters
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        switch(n) {
            case 1:
                System.out.println("Enter km value");
                Scanner sc1 = new Scanner(System.in);
                float k=sc1.nextFloat();
                float Km_to_m = k * 1000;
                System.out.println(k + " KM is equal to " + Km_to_m + " meters");
                break;
            case 2:
                System.out.println("Enter meter value");
                Scanner sc2 = new Scanner(System.in);
                float m=sc2.nextFloat();
                float m_to_km = m / 1000;
                System.out.println(m + " Meters is equal to " + m_to_km + " KM");
                break;
            case 3:
                System.out.println("Enter farhen heat value");
                Scanner sc3 = new Scanner(System.in);
                float f=sc3.nextFloat();
                float f_to_c = ((f - 32) * 5) / 9;
                System.out.println(f + " fahren heat is equal to " + f_to_c + " celsius");
                break;
            case 4:
                System.out.println("Enter celsius value");
                Scanner sc4 = new Scanner(System.in);
                float c=sc4.nextFloat();
                float c_to_f = (c * 9/5) + 32;
                System.out.println(c + " celsius heat is equal to " + c_to_f + " farhen");
                break;
            default:
                System.out.println("nothing");

        }
        }


    }

