package october.ex_11102024;

public class TestAPI extends BaseClass //single inheritance
{
    double housenum=78.908;
    //used super keyword for access super class constructor
    TestAPI()
    {
        super();
        System.out.println("default constructor in child class");
    }
    TestAPI(float sal)
    {
        super("Automation");
        System.out.println("parameterrized constructor in child class");
    }
    TestAPI(String testing)
    {
        this(9.5f);

       // super("ATB8X");//have doubt here
    }

    //used super keyword for access super class method
    void childmethod()
    {
        super.setId(89);
    }
   // used super keyword for aceess super variables
    void childvariable()
    {
        System.out.println("super class variable :"+super.housenum);
        System.out.println(this.housenum);
    }

    //overload done in 2 different classes by inheriting
    void performGet(double d)
    {
        System.out.println("child class performget methos : "+d);
    }
    //overload done in single class
    void overload(String address)
    {
        System.out.println(address);
    }
    void overload(char c)
    {
        System.out.println(c);
    }

    //override in 2 classes we can not override method in single class
    void performPut()
    {
        System.out.println(23);
    }


}
