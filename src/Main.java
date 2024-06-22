
public class Main {
    public static void main(String[] args) throws EmptyException, PriceNegativeException {

        Library library = new Library();

        try {
            // create objects(items) to add them to the list
            Book b1 = new Book("from 0", "dar el nashr", 320, "yasser mamdouh", 123);
            Magazine m1 = new Magazine("al-ahram", "al-ahram news", 58, 12345);
            Ebook e1 = new Ebook("mslakyat", "al-doraa printing", 275, "ibrahym sakran", 451, "18mb", "1215.15.115");

            // add the items to the list
            library.addItem(b1);
            library.addItem(e1);
            library.addItem(m1);

            // display all items in the list
            System.out.println("\nDisplaying all items in the library: ");
            System.out.println(library.displayItems());;


            // Demonstrating dynamic method dispatch
            System.out.println("Demonstrating dynamic method dispatch: ");
            System.out.println(library.printItem(b1));
            System.out.println(library.printItem(e1));
            System.out.println(library.printItem(m1));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("it is executed in any ways");
        }

        System.out.println();


        // exception handling by using (( custom exception or user-defined exception ))
        System.out.println("Exception handling demonstration: ");
        try {
            Book b2 = new Book("",null,-10,"khalid",458);
        }
        catch (Exception e){
            System.out.println("Errors: " + e.getMessage());
        }
        finally {
            System.out.println("it is executed in any ways");
        }

    }
}