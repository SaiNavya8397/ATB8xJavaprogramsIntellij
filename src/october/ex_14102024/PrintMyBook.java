package october.ex_14102024;

public class PrintMyBook extends Book{

    void getDetails(String name,String Author, int Price) {
        System.out.println(name);
        System.out.println(Author);
        System.out.println(Price);
    }

        public static void main(String[] args)
        {
            Book b=new PrintMyBook();
            b.getDetails("Navya","Aadhya",5);
        }
    }


