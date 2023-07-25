package Lesson_06.book;

public class GenreBook implements Genre {
    private String genreName;

    public GenreBook(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String getGenre() {
        return this.genreName;
    }
}
