public class Ebook extends Book{
    private String fileSize;
    private String downloadUrl;

    // constructor
    public Ebook(String title, String publisher, double price, String author, int isbn, String fileSize, String downloadUrl) throws EmptyException, PriceNegativeException {
        super(title, publisher, price, author, isbn);
        this.fileSize = fileSize;
        this.downloadUrl = downloadUrl;
    }

    // getter and setter

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String getDetails() {
        return  "\nEbook: \"" + title + "\" by " + getAuthor() +
                "\nPublisher: " + publisher +
                "\nPrice: " + price +
                "\nISBN: " + getIsbn() +
                "\nFile size: " + fileSize +
                "\nDownload URL: " + downloadUrl +
                "\nReading method: " + read() +
                "\nCatalogue: \"" + catalogueItem() + "\"" + "\n";
    }
    @Override
    public String read() {
        return "Read as an ebook";
    }

    public String print() {
        return  "Printing details for Ebook: \"" + title + "\" by " + getAuthor();
    }

}
