package Lesson_06.Seminar.formatter;

import Lesson_06.Seminar.book.ElectronBook;

public class HTMLFormatter implements Formatter{
    @Override
    public void toFormat(ElectronBook book) {
        if(!book.getFormat().equals("HTML")){
            System.out.printf("Книга %s (автор: %s, год: %d) переведена в формат HTML \n",
                    book.getName(), book.getAuthor(), book.getYear());
        }else{
            System.out.println("Книга " + book.getName() + " уже в формате HTML");
        }
    }
}
