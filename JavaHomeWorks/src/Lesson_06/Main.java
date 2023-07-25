package Lesson_06;

import Lesson_06.book.Book;
import Lesson_06.book.ElectronBook;
import Lesson_06.book.GenreBook;
import Lesson_06.book.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(Arrays.asList(
                new Book("Name1", "BookAuthor1", new GenreBook("триллер"),1999),
                new Book("Name2", "BookAuthor3", new GenreBook("драмма"),1999),
                new Book("Name3", "BookAuthor2", new GenreBook("триллер"),2022),
                new Book("Name4", "BookAuthor3", new GenreBook("комедия"),1968),
                new Book("Name5", "BookAuthor1", new GenreBook("триллер"),1999),
                new ElectronBook("Name6", "BookAuthor2", new GenreBook("комедия"),2000, "TEXT", 1024),
                new ElectronBook("Name7", "BookAuthor3", new GenreBook("комедия"),2001, "PDF", 512),
                new ElectronBook("Name8", "BookAuthor3", new GenreBook("комедия"),2003, "JSON", 1024),
                new ElectronBook("Name9", "BookAuthor1", new GenreBook("комедия"),2003, "HTML", 2048)
        ));

        Library library = new Library(bookList);
    }
}
