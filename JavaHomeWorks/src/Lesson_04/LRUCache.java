package Lesson_04;

import java.util.ArrayList;
import java.util.List;

public class LRUCache <E>{
    ArrayList<E> listE;
    int size;

    public LRUCache(int size) {
        this.size = size;
        listE = new ArrayList<>();
    }

    public void addElement(E employee) {
        if(this.listE.size() > this.size){
            listE.remove(0);
        }
        this.listE.add(employee);
    }

    public E getElement(int index){
        if(index >= this.listE.size())
            return null;

        return this.listE.get(index);
    }

    public List<E> getAllElements() {
        return this.listE;
    }

}
