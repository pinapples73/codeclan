import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capcity = 2;

    public Library(){
        this.stock = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.stock.size();
    }

    public void addBook(Book book){
        if(this.checkStockCapacity()){
            this.stock.add(book);
        }
   }

   public boolean checkStockCapacity(){
        if(this.countBooks() < this.capcity) {
            return true;
        } else {
            return false;
        }
   }




}
