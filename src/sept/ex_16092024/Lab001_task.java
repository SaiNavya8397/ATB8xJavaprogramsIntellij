package sept.ex_16092024;
/* 1. difference between == and =
= assignement operator, this is used to assign a value to variable
== relational operator, this is used to compare two values

2. byte b = 10; long l = 10l; → How much Byte will be used.
byte b=10 will take 1 byte and long l =10l will take  8 byte so total is 9bytes.
 */
public class Lab001_task {
    public static void main(String args[])
    {
        //3rd question === byte b = 10; byte c = 10;  What is the anwser if the perform b+c, What is the data type it will give in result.
        byte b=10;
    byte c=10;
        System.out.printf("sum of b and c = %d\n",b+c);

       // as per rules byte+byte will get int data type
//4th question ===
// short s = 10;
//        char a = 'A'; //65 , sum of s and a
        short s= 10;
        char a='A';
        System.out.printf("sum of s and a = %d", s+a);

}}
