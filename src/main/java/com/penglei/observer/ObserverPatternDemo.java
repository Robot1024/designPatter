package com.penglei.observer;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ObserverPatternDemo
 * @Description TODO
 * @date 2020-05-09 17:37
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        //隐藏了 subject 的 attach方法
        //必须把持有者传入进去，这样观察者才能取到变化后值
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}