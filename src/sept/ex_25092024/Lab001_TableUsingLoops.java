package sept.ex_25092024;

public class Lab001_TableUsingLoops
{
    public static void main(String[] args) {
        int t=10;
        //using for loop
        for(int i=1;i<=10;i++)
        {
            //use any of the below statements
            //System.out.println(i+"*"+t+"="+(i*t));
            System.out.printf("%d * %d = %d\n", i,t,(i*t));
        }

        //using while loop
        int j=1;
        while(j<=10)
        {
            int res=j*t;
            //System.out.println(j+"*"+t+"="+(j*t));
            System.out.println(j+"*"+t+"="+res);
            j++;
        }

    }
}
