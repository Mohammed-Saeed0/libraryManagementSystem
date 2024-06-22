public class Book extends LibraryItem implements Readable,Printable{

    private String author;
    private int isbn;

    //constructor

    public Book(String title, String publisher, double price, String author, int isbn) throws PriceNegativeException, EmptyException {
        super(title, publisher, price);
        this.author = author;
        this.isbn = isbn;
    }


    // getter and setter

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getDetails() {
        return  "\nBook: \"" + title + "\" by " + author +
                "\nPublisher: " + publisher +
                "\nPrice: " + price +
                "\nISBN: " + isbn +
                "\nReading method: " + read() +
                "\nCatalogue: \"" + catalogueItem() + "\"" + "\n";
    }

    @Override
    public String catalogueItem() {
        return "General Fiction";
    }

    @Override
    public String print() {
        return  "Printing details for Book: \"" + title + "\" by " + author;
    }

    @Override
    public String read() {
        return "Read as a physical book";
    }

    @Override
    public void updateCatalogue() {
        System.out.println("update the catalogue of Book : " + title);
    }

}
