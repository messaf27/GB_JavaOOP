package Lesson_06.Seminar.genre;

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
