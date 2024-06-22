public abstract class LibraryItem {

    protected String title;
    protected String publisher;
    protected double price;

    // getter and setter


    public LibraryItem(String title, String publisher, double price) throws PriceNegativeException, EmptyException {
        // custom exception or user defined exception
        if (price < 0 ) throw new PriceNegativeException("price must be positive");
        if(title.isEmpty()) throw new EmptyException("title can not be empty");
        if(publisher.isEmpty()) throw new EmptyException("publisher can not be empty");

        this.title = title;
        this.publisher = publisher;
        this.price = price;
    }

    // getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //
    public abstract String getDetails();  // method to return item details as a String
    public abstract String catalogueItem(); // method to categorize the item
    public abstract void updateCatalogue(); // method to update the catalogue



}
