public class Book {
    private static String libraryName="National Library";
    private final String isbn;
    private String title;
    private String author;

    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    
    public void display(){
       if(this instanceof Book){
        System.out.println("Library is: "+libraryName);
        System.out.println("ISBN is: "+isbn);
        System.out.println("Title of the Book is: "+title);
        System.out.println("Author of the Book is: "+author);
       }
    }

    public static void displayLibraryName(){
        System.out.println("Library Name is: "+libraryName);
    }

    public static void main(String[] args) {
        Book book1=new Book("9218-722", "Introduction to Discrete Mathematics", "R. Hirschfelder");
        Book book2=new Book("1011-657", "Introduction to Python", "Guido van Rossum");

        book1.display();
        book2.display();
        Book.displayLibraryName();
    }
}
