package Lesson_06.formatter;

import Lesson_06.book.ElectronBook;

public class HTMLFormatter implements Formatter{
    @Override
    public void toFormat(ElectronBook book) {
        System.out.printf("Книга %s (автор: %s, год: %d) переведена в формат HTML",
                book.getName(), book.getAuthor(), book.getYear());
    }
}
