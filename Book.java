public class Book {
    private String title;
    private String author;
    private String isbn;

//    parameteraised constructor
    public Book(String title, String author, String isbn){
        this.title=title;
        this.author=author ;
        this.isbn=isbn;
    }
//    getters and setters
    public String getTitle(){

        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return isbn;
    }
    public String toString(){
        return "Title"+ title+ "Author" + author+ "ISBN"+ isbn;
    }






}
