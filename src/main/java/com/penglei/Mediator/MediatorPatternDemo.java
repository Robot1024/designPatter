package com.penglei.Mediator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName MediatorPatternDemo
 * @Description TODO
 * @date 2020-05-10 01:27
 */

// 观察者模式 更像广播模式，中介模式  更像 广播。
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}