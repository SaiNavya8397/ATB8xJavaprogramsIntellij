package october.ex_11102024;

public class RunnerClass {
    public static void main(String[] args) {
        BaseClass obj=new TestAPI();//dynamic dispatch
        TestAPI test=new TestAPI();
        //access constructors,methods and variables which has super and this keywordsT
        TestAPI cons=new TestAPI(6.8f);
        TestAPI cons1=new TestAPI("Techmahindra");
        test.childvariable();

        //done with encapsulation concept
        obj.setName("Aadhya");
        test.childmethod();

        //overload and override
        //overload doone in single class
        test.overload('p');
        test.overload("Sai");
        //oveload done in 2 classes
        test.performGet(67.87);
        test.performGet(7); //base class method
        obj.performGet(67); //called using base class obj
        //override
        test.performPut();
        //obj.performPut(); //acessing from base class

    }
    //dynamic dispatch

}
