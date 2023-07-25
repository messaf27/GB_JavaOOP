package Lesson_06.Seminar;

import Lesson_06.Seminar.book.Book;
import Lesson_06.Seminar.book.ElectronBook;
import Lesson_06.Seminar.genre.GenreBook;
import Lesson_06.Seminar.book.Library;
import Lesson_06.Seminar.formatter.Formatter;
import Lesson_06.Seminar.formatter.JSONFormatter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(Arrays.asList(
                new Book("Name1", "BookAuthor1", new GenreBook("триллер"),1999),
                new Book("Name2", "BookAuthor3", new GenreBook("драмма"),1999),
                new Book("Name3", "BookAuthor2", new GenreBook("триллер"),2022),
                new Book("Name4", "BookAuthor3", new GenreBook("комедия"),1968),
                new Book("Name5", "BookAuthor1", new GenreBook("триллер"),1999),
                new ElectronBook("Name6", "BookAuthor2", new GenreBook("драмма"),2000, "TEXT", 1024),
                new ElectronBook("Name7", "BookAuthor3", new GenreBook("комедия"),2001, "PDF", 512),
                new ElectronBook("Name8", "BookAuthor3", new GenreBook("драмма"),2003, "JSON", 1024),
                new ElectronBook("Name9", "BookAuthor1", new GenreBook("триллер"),2003, "HTML", 2048)
        ));

//        System.out.println("library.booksSearchByAuthor(\"BookAuthor1\") = " + library.booksSearchByAuthor("BookAuthor1"));
        String author = "BookAuthor2";
        System.out.println("Search book by author: " + author);
        for (Book searchedAuthor : library.booksSearchByAuthor("BookAuthor2")) {
            System.out.println(searchedAuthor);
        }

        Formatter jsonFormatter = new JSONFormatter();
        jsonFormatter.toFormat((ElectronBook) library.getBooks().get(7));
        jsonFormatter.toFormat((ElectronBook) library.getBooks().get(8));
    }
}
