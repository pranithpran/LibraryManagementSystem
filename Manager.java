import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Item> items;
    public Manager(){
    items=new ArrayList<>() ;
    }

    // add a book
    public void addBook(Item book){
        items.add(book);
    }

    //     search with title
    public  Item searchByTitle(String title){ // Displaced, Data, Computer, MAhatma Gandhi
        for(Item i:items){
            if(i.getTitle().equalsIgnoreCase(title)){
                return i;
            }
        }
        return null;
    }

    // searchByAuthor - an author can write more than book
//    Tharun-COmputer, Java

    public List<Item> searchByAuthor(String author) { // Ankita- A,B
        List<Item> results = new ArrayList<>();
        for (Item item : items) {
            if (item.getAuthor().equalsIgnoreCase(author)) {
                results.add(item);
            }
        }
        return results;
    }
    // Java is case sensitive . class name first letter will be capital.
    public Item searchByISBN(String isbn) {
        for (Item item : items) {
            if (item.getISBN().equals(isbn)) {
                return item;
            }
        }
        return null;
    }

    public void display() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    //searchByIsbn(){}

// Create a class Student with attributes name and age. Create an object and display details;

    // Inheritance
    // Create a class caled Vehicle with a method displayInfo() that print "This is a vehicle".
    // Create a subclass Car that inherits from Vehicle and overides the displayInfo() "This is a car".





}

