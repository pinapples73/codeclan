import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");

    }

    @Test
    public void bookHasTitle(){
        assertEquals("Lord of the Rings", book.bookHasTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("JRR Tolkien", book.bookHasAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.bookHasGenre());
    }


}
