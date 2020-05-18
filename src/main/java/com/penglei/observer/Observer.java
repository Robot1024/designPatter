package com.penglei.observer;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Observer
 * @Description TODO
 * @date 2020-05-09 16:18
 */
// 所有观察者的抽象类
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}