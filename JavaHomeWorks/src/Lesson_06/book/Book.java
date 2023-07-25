package Lesson_06.book;

import Lesson_06.genre.GenreBook;

public class Book {
    private String name;
    private String author;
    private int year;

    private GenreBook genreBook;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Book(String name, String author, GenreBook genreBook, int year) {
        this.name = name;
        this.author = author;
        this.genreBook = genreBook;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
