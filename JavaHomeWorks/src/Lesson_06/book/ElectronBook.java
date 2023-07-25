package Lesson_06.book;

import Lesson_06.book.Book;

public class ElectronBook extends Book {
    private String format;
    private Integer size;
    public ElectronBook(){};
    public ElectronBook(String name, String author, GenreBook genreBook, int year, String format, Integer size) {
        super(name, author, genreBook, year);
        this.format = format;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}
