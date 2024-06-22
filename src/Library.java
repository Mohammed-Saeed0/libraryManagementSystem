import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<LibraryItem> itemsList;

    // constructor
    public Library(){
        itemsList = new ArrayList<>();
    }

    // method to add item to the list
    public void addItem(LibraryItem item){
        itemsList.add(item);
    }

    // method to remove item from the list
    public void removeItem(LibraryItem item){
        itemsList.remove(item);
    }

    // method to display all items in the list
    public String displayItems(){
        String total = "\n";
        for (int i = 0; i < itemsList.size(); i++) {
            LibraryItem item = itemsList.get(i);
            total = total + "item: "+ (i+1) + item.getDetails() + "\n";
        }
        return total;
    }

    public String printItem(Printable item) {
        return item.print();
    }
}
