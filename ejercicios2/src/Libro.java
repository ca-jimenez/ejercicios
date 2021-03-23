public class Libro {

    private String title;
    private String isbn;
    private String author;

    public Libro(String title, String isbn, String author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Libro() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void prestamo() {

    }

    public void devolucion() {

    }

    @Override
    public String toString() {

        return this.title + ", ISBN: " + this.isbn + ", author: " + author;
    }
}
