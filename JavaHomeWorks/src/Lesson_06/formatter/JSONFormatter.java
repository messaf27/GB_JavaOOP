package Lesson_06.formatter;

import Lesson_06.book.ElectronBook;

public class JSONFormatter implements Formatter {
    @Override
    public void toFormat(ElectronBook book) {
        if(!book.getFormat().equals("JSON")){
            System.out.printf("Книга %s (автор: %s, год: %d) переведена в формат JSON\n",
                    book.getName(), book.getAuthor(), book.getYear());
        }else{
            System.out.println("Книга " + book.getName() + " уже в формате JSON");
        }
    }
}
