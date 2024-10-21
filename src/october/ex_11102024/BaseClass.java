package october.ex_11102024;

public class BaseClass {
    BaseClass()
    {
        System.out.println("Default constructor");
    }
    BaseClass(String test)
    {
        System.out.println(test);
    }
    void method(boolean married, long adhar)
    {
        System.out.println(married);
        System.out.println(adhar);
    }

    private int id;
    private String name;
    double housenum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    void performGet(int n)
    {
        System.out.println("base class get method : "+n);
    }
    void performPut()
    {
        System.out.println("Base class override method");
        System.out.println(56);
    }
    void performPatch()
    {

    }
    void performPost()
    {

    }
    void performDelete()
    {

    }

}
