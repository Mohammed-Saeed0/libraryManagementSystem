public class Magazine extends LibraryItem implements Readable,Printable{



    private int issueNumber;

    // constructor

    public Magazine(String title, String publisher, double price, int issueNumber) throws PriceNegativeException, EmptyException {
        super(title, publisher, price);
        this.issueNumber = issueNumber;
    }


    // setter and getter

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String getDetails() {
        return  "\nMagazine: \"" + title + "\" " +
                "\nPublisher: " + publisher +
                "\nPrice: " + price +
                "\nIssue Number: " + issueNumber +
                "\nReading method: " + read() +
                "\nCatalogue: " + catalogueItem() + "\"" + "\n";

    }

    @Override
    public String catalogueItem() {
        return "Technology";
    }

    @Override
    public String print() {
            return  "Printing details for magazine: \"" + title + "\"";
        }


    @Override
    public String read() {
        return "Read as a physical magazine";
    }

    @Override
    public void updateCatalogue() {
        System.out.println("update the catalogue of magazine : " + title);
    }
}
