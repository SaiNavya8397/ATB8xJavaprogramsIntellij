package sept.ex_20092024;

public class Lab002_TernaryScore {
    public static void main(String[] args) {

    int score = 65;
    //String A, B, C, F;
    String res = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C ": "F";
        System.out.println(res);

}}
