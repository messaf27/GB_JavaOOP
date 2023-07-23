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
        listE.add(employee);
    }

    public E getElement(int index){
        if(index >= listE.size())
            return null;

        return this.listE.get(index);
    }

    public List<E> getAllElements() {
        return listE;
    }
}
