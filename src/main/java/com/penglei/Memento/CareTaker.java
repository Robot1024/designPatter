package com.penglei.Memento;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName CareTaker
 * @Description TODO
 * @date 2020-05-10 01:54
 */
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}