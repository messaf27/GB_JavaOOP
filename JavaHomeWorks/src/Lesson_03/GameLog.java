package Lesson_03;

import java.util.ArrayList;
import java.util.List;

public class GameLog {
    private List<String> log = new ArrayList<>();
    private int logIndex = 0;
    public void addMessage(String msg){
        this.logIndex++;
        this.log.add(String.format("[%d] %s", this.logIndex, msg));
    }

    public void printLog(){
        log.forEach((msg) -> System.out.printf("LOG: %s; \r\n", msg));
    }
}
