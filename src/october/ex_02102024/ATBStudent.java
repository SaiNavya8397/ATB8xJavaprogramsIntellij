package october.ex_02102024;

public class ATBStudent {
        //attributes
        String name="Navya";
        int age=25;
        String disignation ="tester";
        float salary=6.5f;
        char surname='P';
        //behaviours
        public void eat()
        {
            System.out.println("name: "+name);
        }
        public void sleep()
        {
            System.out.println("age: "+age);
        }
        public void walk()
        {
            System.out.println("designation: "+disignation);
        }
        public void work()
        {
            System.out.println("salary :"+salary);
        }
        public void speak()
        {
            System.out.println("Surname :"+surname);
        }
    public static void main(String[] args) {
            ATBStudent stu=new ATBStudent();
            stu.eat();
            stu.sleep();
            stu.walk();
            stu.work();
            stu.speak();
    }
}
