package Lesson_06.Seminar.search;

import Lesson_06.Seminar.book.Book;

import java.util.List;

public interface Searchable {
    public List<Book> booksSearchByAuthor(String author);
}
