package Lesson_06.book;

import Lesson_06.book.Book;

import java.util.List;

public interface Searchable {
    public List<Book> booksSearchByAuthor(String author);
}
