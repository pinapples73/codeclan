public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String bookHasTitle(){
        return this.title;
    }

    public String bookHasAuthor(){
        return this.author;
    }

    public String bookHasGenre(){
        return this.genre;
    }


}
