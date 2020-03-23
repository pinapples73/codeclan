import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String, Integer> genreHashmap;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreHashmap = new HashMap<String, Integer>();
    }

    public int countBooks(){
        return this.stock.size();
    }

    public void addBook(Book book){
        if(this.checkStockCapacity()){
            this.stock.add(book);
            this.addToGenreHashmap(book);
        }
   }

   public boolean checkStockCapacity(){
        if(this.countBooks() < this.capacity) {
            return true;
        } else {
            return false;
        }
   }

   public void addToGenreHashmap(Book book){
        String genre = book.getGenre();

        //if the genre already exists in Hashmap, extract existing count and assign it to
       // variable counter
       if(this.genreHashmap.containsKey(genre)){
           int counter = genreHashmap.get(genre);

           // add one to counter
           counter++;

           //put the key and new value back into hashmap
           this.genreHashmap.put(genre, counter);
       } else {
           this.genreHashmap.put(genre, 1);
       }
   }

   public void loanBook(Book book, Borrower borrower){
        //check if the book is in the collection
       if(this.stock.contains(book)){
           //if it is, remove from collection
           this.stock.remove(book);

           //add to borrower
           borrower.addBook(book);
       }
   }

   public boolean checkInStock(Book book){
        //return this.stock.contains(book)
       for(Book individualBook:this.stock){
           if(individualBook == book){
               return true;
           }
       }
       return false;
   }

}
