package sept.ex_20092024;

public class Lab001_TernaryMaxNum {
    public static void main(String[] args) {
        int a=60, b=44, c=93;
        int max= (a>b)?a:(b>c)?b:(c>a)?c:a;
        System.out.println(max);
   }
}
