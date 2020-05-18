package com.penglei.observer;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Subject
 * @Description TODO
 * @date 2020-05-09 16:17
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {

    // List的观察者集合，把所有需要通知的观察者放到这里
    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }


    // 一旦状态变更，调用通知方法，通知所有的观察者
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    //添加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //遍历观察者，调用观察者更新方法
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}