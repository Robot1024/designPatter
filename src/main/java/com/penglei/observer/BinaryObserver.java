package com.penglei.observer;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName BinaryObserver
 * @Description TODO
 * @date 2020-05-09 16:18
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}