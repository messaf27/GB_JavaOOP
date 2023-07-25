package Lesson_06.book;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> books;
    public Library() {
    }
    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public List<Book> booksSearchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if(book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    public List<Book> getBooks() {
        return books;
    }
}
