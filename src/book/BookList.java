package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 徐宇航
 * Date: 2023-08-05
 * Time: 18:18
 */
public class BookList {
    private Book[] books ;
    private int usedSize;

    public BookList() {
        this.books = new Book[10];
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public void setBooks(int pos,Book book) {
        books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
