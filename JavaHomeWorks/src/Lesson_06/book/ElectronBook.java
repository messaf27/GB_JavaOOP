package Lesson_06.book;

import Lesson_06.genre.GenreBook;

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
        return "ElectronBook {" +
                "name='" + super.getName() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", year=" + super.getYear() +
                "format='" + format + '\'' +
                ", size=" + size +
                "} ";
    }

    public String getFormat() {
        return format;
    }

    public Integer getSize() {
        return size;
    }
}
