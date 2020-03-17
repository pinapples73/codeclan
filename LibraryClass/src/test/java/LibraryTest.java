import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        book = new Book("IT", "Stephen King", "Horror");
        library = new Library();
    }

    @Test
    public void testCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void testAddBook(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void testCheckStockCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }




}
