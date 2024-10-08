package october.ex_04102024;

public class PERESON {
    int age=25;
    static String name="Navya";
    char surname='P';
    float sal=6.5f;
    long adhar=456734567896l;
    double salary=6.50000;
    static boolean vote;
    String designation;
    String cityname, address;
    char gender;
    int childs;

    //default constructor
    PERESON()
    {
        System.out.println("default constructor");
        // System.out.println("Gendere in default constructor :"+ gender);
        //System.out.println("childs in default constructor :"+childs);
        //System.out.println("==========================================");
    }

    //parameterrized constructor 1
    PERESON(String cityname, String address, int childs)
    {
        String city=cityname;
        String addr=address;
        int childrens=childs;
        System.out.println("Parameterized constuctor using differnt variables");
        System.out.println("cityname :"+cityname);
        System.out.println("Address :"+address);
        System.out.println("Childrens :"+childs);
    }

    //parameterized constructor 2 using this keyword
    PERESON(char gender, boolean vote, String designation)
    {
        this.gender=gender;
        this.vote=vote;
        this.designation=designation;
        System.out.println("Parameterized constructor using This keyword ");
        System.out.println("Gender is :"+gender);
        System.out.println("do you have vote :"+vote);
        System.out.println("Designation of person :"+designation);
    }
    //parameterized constructor 3 --pass values through object creation but did not print anything
    PERESON(int age, float sal,long adhar)
    {

    }

    //Behaviours
    void walk()
    {
        System.out.println("How many kilometers walked : "+age);
    }
    int sleep(int kids)//send value whike creatiing object and used different variable name
    {
        System.out.println(kids);
        return kids;
    }
    void eat()
    {
        System.out.println("How much quantity you can eat : "+sal);
    }

    String work(String pname)
    {
        System.out.println(pname);
        return name;
    }//
    boolean speak(boolean vote)//pass arguments through object creation but used same variable name
    {
        System.out.println(vote);
        return true;
    }

    public static void main(String[] args) {
        //create 5 objectes and call the methods
        PERESON p1=new PERESON();
        p1.walk();
        PERESON p2=new PERESON();
        p2.sleep(3);
        PERESON p3=new PERESON();
        p3.eat();
        PERESON p4=new PERESON();
        p4.work(name);
        PERESON p5=new PERESON();
        boolean vote=p5.speak(false);


        /*no need to call defalut constructor because by creating object itslef defaluct constructor got invoked
        here default constructor called 5 times.*/

        //call parameterized constructor
        PERESON pc1=new PERESON("Hyd","fgyuiyhjkfg",7);
        PERESON pc2=new PERESON('f',true,"tester");
        PERESON pc3=new PERESON(25,6.5f,345676545678l);
    }
}
