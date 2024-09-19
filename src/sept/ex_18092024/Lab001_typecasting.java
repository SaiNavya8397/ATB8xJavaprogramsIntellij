package sept.ex_18092024;

public class Lab001_typecasting {
    public static void main(String[] args) {
        //narrowing --- convert high to low
        int a =425;
        byte b;
        b=(byte)a;
        System.out.println(b);

        //widening --- convert low to high
        float f=4567.87f;
                double d=f;
        System.out.println(d);
        System.out.println();
    }


}
