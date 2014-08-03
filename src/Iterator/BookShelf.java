package Iterator;

import java.util.ArrayList;

/**
 * Created by Naver on 2014-07-25.
 */
public class BookShelf implements Aggregate{
//    private Book[] books;
//    private Vector<Book> books;
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf(int maxsize) {
//        this.books = new Book[maxsize];
//        this.books = new Vector<Book>(maxsize);
        this.books = new ArrayList<Book>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
//        return books[index];
    }

    public void appendBook(Book book) {
        books.add(book);
//        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
